; ${PROGRAM_NAME}.nsi
;
; This script is based on example1.nsi, but it remember the directory, 
; has uninstall support and (optionally) installs start menu shortcuts.
;
; It will install example2.nsi into a directory that the user selects,

;--------------------------------
!define VERSION "0.16"
!define PROGRAM_NAME "MQJExplorer"

; The name of the installer
Name "${PROGRAM_NAME} ${VERSION}"

; The file to write
OutFile "build\${PROGRAM_NAME}_v${VERSION}\${PROGRAM_NAME}_v${VERSION}_setup.exe"

; The default installation directory
InstallDir $PROGRAMFILES\${PROGRAM_NAME}

; Registry key to check for directory (so if you install again, it will 
; overwrite the old one automatically)
InstallDirRegKey HKLM "Software\${PROGRAM_NAME}" "Install_Dir"

;--------------------------------

; Pages

Page components
Page directory
Page instfiles

UninstPage uninstConfirm
UninstPage instfiles

;--------------------------------

; The stuff to install
Section "${PROGRAM_NAME}"
  SectionIn RO
    
  SetOutPath $INSTDIR 
  File /r "bin"
  File /r "lib"
  File /r "icons"
  File /r "res"
  File /r "CodeWiz"
  File "runme.bat"
  File "AUTHORS"
  File "COPYING"
  File "README"
  File "THANKS"
  File "VERSION"
  
  ; Write the installation path into the registry
  WriteRegStr HKLM SOFTWARE\${PROGRAM_NAME} "Install_Dir" "$INSTDIR"
  
  ; Write the uninstall keys for Windows
  WriteRegStr HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\${PROGRAM_NAME}" "DisplayName" "${PROGRAM_NAME}"
  WriteRegStr HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\${PROGRAM_NAME}" "UninstallString" '"$INSTDIR\uninstall.exe"'
  WriteRegDWORD HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\${PROGRAM_NAME}" "NoModify" 1
  WriteRegDWORD HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\${PROGRAM_NAME}" "NoRepair" 1
  WriteUninstaller "uninstall.exe"
  
  CreateDirectory "$SMPROGRAMS\${PROGRAM_NAME}"
  CreateShortCut "$SMPROGRAMS\${PROGRAM_NAME}\Uninstall.lnk" "$INSTDIR\uninstall.exe" "" "$INSTDIR\uninstall.exe" 0

  CreateShortCut "$SMPROGRAMS\${PROGRAM_NAME}\${PROGRAM_NAME}.lnk" "$INSTDIR\runme.bat" "" "$INSTDIR\icons\logo.ico"
  
  CreateShortCut "$DESKTOP\${PROGRAM_NAME}.lnk" "$INSTDIR\runme.bat" "" "$INSTDIR\icons\logo.ico"

SectionEnd

Section /o "Sources"
  SetOutPath $INSTDIR 
  
  File /r "java"
  File /r "control"
  CreateDirectory  "$INSTDIR\tmp"
  CreateDirectory  "$INSTDIR\test"
  File /r "web"
  File /r "xdg"

  File "build.xml"  
  File "createDebPackage.sh"
  File "debian-binary"
  File "default_shortcut_specification.xml"
  File "gpg_sign.sh"
  File "IzPack.xml"
  File "KEYS"
  File "keystore.dat"
  File "${PROGRAM_NAME}.jnlp"
  File "${PROGRAM_NAME}.nsi"
  File "RegistrySpec.xml"
  File "runme.sh"
  File "Unix_shortcutSpec.xml"
  
SectionEnd

;--------------------------------

; Uninstaller

Section "Uninstall"
  
  ; Remove registry keys
  DeleteRegKey HKLM "Software\Microsoft\Windows\CurrentVersion\Uninstall\${PROGRAM_NAME}"
  DeleteRegKey HKLM SOFTWARE\${PROGRAM_NAME}

  ; Remove shortcut on desktop
  Delete "$DESKTOP\${PROGRAM_NAME}.lnk"

  ; Remove shortcuts, if any
  Delete "$SMPROGRAMS\${PROGRAM_NAME}\*.*"
  RMDir /r "$SMPROGRAMS\${PROGRAM_NAME}"
  
  ; Remove files and uninstaller
  Delete "$INSTDIR\*.*"
  RMDir /r "$INSTDIR"

SectionEnd
