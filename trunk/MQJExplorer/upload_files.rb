#!/usr/bin/env ruby
require 'rubygems'
require "watir-webdriver"

url = "http://code.google.com/p/mqjexplorer/downloads/list"

def upload_single_file(file_to_upload)
    file_to_upload = File.expand_path(start_dir + "/" + file)
    puts file_to_upload
    filename = File.basename(file_to_upload)
    puts filename
    if File.exist?(file_to_upload)
		begin
			browser.goto(url)
			browser.link(:text, "New download").click
			
			browser.text_field(:id, "summary").set(filename)
			browser.text_field(:id, "description").set(filename)
			browser.file_field(:id, "filefield").set(file_to_upload)        
					
			if filename.end_with?(".bin.tar.gz")
				browser.text_field(:id, "labelenter0").set("Feature")
				browser.text_field(:id, "labelenter1").set("OpSys-OSX")
				browser.text_field(:id, "labelenter2").set("OpSys-Linux")
				browser.span(:text, "Add a row").click
				browser.text_field(:id, "labelenter3").set("OpSys-Unix")
			elsif filename.end_with?(".src.tar.gz")
				browser.text_field(:id, "labelenter0").set("Type-Source")
				browser.text_field(:id, "labelenter1").set("OpSys-OSX")
				browser.text_field(:id, "labelenter2").set("OpSys-Linux")
				browser.span(:text, "Add a row").click
				browser.text_field(:id, "labelenter3").set("OpSys-Unix")
			elsif filename.end_with?(".src.zip")
				browser.text_field(:id, "labelenter0").set("Type-Source")
				browser.text_field(:id, "labelenter1").set("OpSys-Windows")
			elsif filename.end_with?("_setup.sh")
				browser.text_field(:id, "labelenter0").set("Feature")
				browser.text_field(:id, "labelenter1").set("OpSys-OSX")
				browser.text_field(:id, "labelenter2").set("OpSys-Linux")
				browser.span(:text, "Add a row").click
				browser.text_field(:id, "labelenter3").set("OpSys-Unix")
			elsif filename.end_with?(".deb")
				browser.text_field(:id, "labelenter0").set("Feature")
				browser.text_field(:id, "labelenter1").set("OpSys-Linux")
			elsif filename.end_with?(".bin.zip")
				browser.text_field(:id, "labelenter0").set("Feature")
				browser.text_field(:id, "labelenter1").set("OpSys-Windows")
			elsif filename.end_with?("_setup.jar")
				browser.text_field(:id, "labelenter0").set("Feature")
				browser.text_field(:id, "labelenter1").set("OpSys-All")
				browser.text_field(:id, "labelenter2").set("Type-Installer")
			elsif filename.end_with?(".sha")
				browser.text_field(:id, "labelenter0").set("OpSys-All")
			elsif filename.end_with?(".asc")
				browser.text_field(:id, "labelenter0").set("OpSys-All")
			elsif filename.end_with?(".md5")
				browser.text_field(:id, "labelenter0").set("OpSys-All")
			end

			browser.button(:id, "submit").click    
			
       	rescue Exception=>e
			puts e
			puts "An error occurred: #{$!}"
		end	
end

if ARGV.length != 1
  puts "Usage: DIR"
  exit 1
end

start_dir = ARGV[0]

if !File.exist?(start_dir)
	puts "ERROR: Directory #{start_dir} not exists!"
	exit 1
end

driver = Selenium::WebDriver::Remote::Http::Default.new
browser = Watir::Browser.new :firefox, :http_client => driver, :profile => "default"

Dir.foreach(start_dir) do |file|
    file_to_upload = File.expand_path(start_dir + "/" + file)
    upload_single_file(file_to_upload)
end

browser.close

exit 0
