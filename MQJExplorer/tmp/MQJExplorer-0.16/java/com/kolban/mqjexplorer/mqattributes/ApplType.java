// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ApplType.java

package com.kolban.mqjexplorer.mqattributes;

import javax.swing.JComboBox;

public class ApplType extends JComboBox
{

    public ApplType()
    {
        init();
    }

    public int getValue()
    {
        switch(getSelectedIndex())
        {
        case 0: // '\0'
            return 6;

        case 1: // '\001'
            return 26;

        case 2: // '\002'
            return 1;

        case 3: // '\003'
            return 21;

        case 4: // '\004'
            return 10;

        case 5: // '\005'
            return 5;

        case 6: // '\006'
            return 13;

        case 8: // '\b'
            return 3;

        case 9: // '\t'
            return 2;

        case 10: // '\n'
            return 22;

        case 11: // '\013'
            return 13;

        case 12: // '\f'
            return 4;

        case 13: // '\r'
            return 2;

        case 14: // '\016'
            return 8;

        case 15: // '\017'
            return 6;

        case 16: // '\020'
            return 12;

        case 17: // '\021'
            return 14;

        case 18: // '\022'
            return 9;

        case 19: // '\023'
            return 11;

        case 20: // '\024'
            return 20;

        case 7: // '\007'
        default:
            return 0;
        }
    }

    private void init()
    {
        addItem("AIX");
        addItem("Broker");
        addItem("CICS");
        addItem("CICS Bridge");
        addItem("CICS VSE");
        addItem("DOS");
        addItem("Guardian");
        addItem("IMS");
        addItem("IMS Bridge");
        addItem("MVS");
        addItem("Notes Agent");
        addItem("NSK");
        addItem("OS/2");
        addItem("OS/390");
        addItem("OS/400");
        addItem("Unix");
        addItem("VMS");
        addItem("VOS");
        addItem("Windows");
        addItem("Windows NT");
        addItem("XCF");
    }

    public void setValue(int i)
    {
        switch(i)
        {
        case 26: // '\032'
            setSelectedIndex(1);
            return;

        case 1: // '\001'
            setSelectedIndex(2);
            return;

        case 21: // '\025'
            setSelectedIndex(3);
            return;

        case 10: // '\n'
            setSelectedIndex(4);
            return;

        case 5: // '\005'
            setSelectedIndex(5);
            return;

        case 13: // '\r'
            setSelectedIndex(6);
            return;

        case 3: // '\003'
            setSelectedIndex(7);
            return;

        case 19: // '\023'
            setSelectedIndex(8);
            return;

        case 2: // '\002'
            setSelectedIndex(9);
            return;

        case 22: // '\026'
            setSelectedIndex(10);
            return;

        case 4: // '\004'
            setSelectedIndex(12);
            return;

        case 8: // '\b'
            setSelectedIndex(14);
            return;

        case 6: // '\006'
            setSelectedIndex(15);
            return;

        case 12: // '\f'
            setSelectedIndex(16);
            return;

        case 14: // '\016'
            setSelectedIndex(17);
            return;

        case 9: // '\t'
            setSelectedIndex(18);
            return;

        case 11: // '\013'
            setSelectedIndex(19);
            return;

        case 20: // '\024'
            setSelectedIndex(20);
            return;

        case 7: // '\007'
        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
        case 18: // '\022'
        case 23: // '\027'
        case 24: // '\030'
        case 25: // '\031'
        default:
            setSelectedIndex(-1);
            return;
        }
    }

    public static String toString(int i)
    {
        switch(i)
        {
        case 26: // '\032'
            return "BROKER";

        case 1: // '\001'
            return "CICS";

        case 21: // '\025'
            return "CICS Bridge";

        case 10: // '\n'
            return "CICS/VSE";

        case 5: // '\005'
            return "DOS";

        case 13: // '\r'
            return "Guardian";

        case 3: // '\003'
            return "IMS";

        case 19: // '\023'
            return "IMS Bridge";

        case 2: // '\002'
            return "MVS";

        case 22: // '\026'
            return "Notes";

        case 4: // '\004'
            return "OS/2";

        case 8: // '\b'
            return "OS/400";

        case 6: // '\006'
            return "Unix";

        case 12: // '\f'
            return "VMS";

        case 14: // '\016'
            return "VOS";

        case 9: // '\t'
            return "Windows";

        case 11: // '\013'
            return "Windows NT";

        case 20: // '\024'
            return "XCF";

        case 7: // '\007'
        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
        case 18: // '\022'
        case 23: // '\027'
        case 24: // '\030'
        case 25: // '\031'
        default:
            return "Unknown";
        }
    }
}
