/*
 * Copyright 2020 Web3 Labs Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.web3j.console;


import org.web3j.console.wrapper.subcommand.SolidityGenerateCommand;

/**
 * web3j command
 * https://docs.web3j.io/4.8.7/command_line_tools/
 */
public class Web3j {
    /**
     * @see Web3jCommand#parse()
     * @see SolidityGenerateCommand#run()
     * @see @see org.web3j.codegen.SolidityFunctionWrapperGenerator#generate()
     *
     * @param args
     */
    public static void main(String[] args) {
        System.setProperty("picocli.version.name.0", "-v");
        final int result = new Web3jCommand(System.getenv(), args).parse();
        if (result != 0) {
            System.exit(result);
        }
    }
}
