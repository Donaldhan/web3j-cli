package org.web3j.console;

import org.junit.jupiter.api.Test;
import org.web3j.console.wrapper.subcommand.SolidityGenerateCommand;

/**
 * @ClassName: Web3JTest
 * @Description:
 * @Author: Ravintich
 * @Date: 2023-05-31 19:56
 */
public class Web3JTest {

    /**
     * 生成java合约
     * call web3j generate solidity --binFile=%ABI_BIN_PATH%\ComplexType.bin
     *     --abiFile=%ABI_BIN_PATH%\ComplexType.abi --outputDir=%JAVA_PATH%  --package=%PACKAGE%
     *  https://docs.web3j.io/4.8.7/command_line_tools/
     *
     * @see Web3j
     * @see Web3jCommand#parse()
     * @see SolidityGenerateCommand#run()
//     * @see SolidityFunctionWrapperGenerator.PicocliRunner#run()
     * @see @see org.web3j.codegen.SolidityFunctionWrapperGenerator#generate()
     */
    @Test
    public void generate() {
        String dir = "F:/github/hardhat-usage";
        String binFilePath = dir+"/build/contracts/ComplexType.bin";
        String abiFilePath = dir+"/build/contracts/ComplexType.abi";
        String binFile = "--binFile=" + binFilePath;
        String abiFile = "--abiFile=" + abiFilePath;
        String outputDir = "--outputDir=" + dir + "/java";
        String packageDir = "--package=" + dir + "/contract";
//        String dir = "F:\\github\\hardhat-usage";
//        String binFilePath = dir+"\\build\\contracts\\ComplexType.bin";
//        String abiFilePath = dir+"\\build\\contracts\\ComplexType.abi";
//        String binFile = "--binFile=" + binFilePath;
//        String abiFile = "--abiFile=" + abiFilePath;
//        String outputDir = "--outputDir=" + dir + "\\java";
//        String packageDir = "--package=" + dir + "\\contract";
        String[] args = new String[]{"generate", "solidity", binFile, abiFile, outputDir, packageDir};
        System.setProperty("picocli.version.name.0", "-v");
        final int result = new Web3jCommand(System.getenv(), args).parse();
        if (result != 0) {
            System.exit(result);
        }
    }
}
