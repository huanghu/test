package com.buy.test.cli;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;

public class BaseCli {
	public static void main(String[] args)throws ParseException {
		  Options options = new Options();
	        options.addOption(
	                        "h",                                // short single-character name of the option
	                        "help",                             // long multi-character name of the option
	                        false,                              // flag signally if an argument is required after this option
	                        "Print this usage information"      // self-documenting description
	                );
	        options.addOption("v", "verbose", false, "Print out VERBOSE information");
	        options.addOption("f", "file", true, "File to save program output to");
	        
	        // parse the program arguments
	        CommandLineParser parser = new BasicParser();
	        CommandLine commandLine = parser.parse(
	                        options,                            // the specified Options
	                        args                                // the command line arguments
	                );
	        
	        if (commandLine.hasOption('h')) {
	                System.out.println("Help Message");
	                System.exit(0);
	        }
	        
	        boolean verbose = false;
	        if (commandLine.hasOption('v')) {
	                verbose = true;
	        }
	        
	        if (commandLine.hasOption("f")) {
	                System.out.println(commandLine.getOptionValue('f'));
	        }
	}
}
