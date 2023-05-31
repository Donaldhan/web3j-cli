package org.web3j.console;

import com.squareup.javapoet.ParameterizedTypeName;
import org.junit.jupiter.api.Test;
import org.web3j.codegen.SolidityFunctionWrapperGenerator;

/**
 * @ClassName: SolidityFunctionWrapperGeneratorTest
 * @Description:
 * @Author: Ravintich
 * @Date: 2023-05-31 20:32
 */
public class SolidityFunctionWrapperGeneratorTest {

    /**
     * :test --tests "org.web3j.console.SolidityFunctionWrapperGeneratorTest.generate" --stacktrace --info --debug --scan
     * SolidityFunctionWrapperGenerator
     * @see SolidityFunctionWrapperGenerator#generate()
//     * @see SolidityFunctionWrapperGenerator.PicocliRunner#run()
//     * @see ParameterizedTypeName#get(java.lang.reflect.ParameterizedType, java.util.Map)
     * @see com.squareup.javapoet.TypeName#get(java.lang.reflect.Type, java.util.Map)
     * https://docs.web3j.io/4.8.7/smart_contracts/construction_and_deployment/
     * org.web3j.codegen.SolidityFunctionWrapperGenerator -b /path/to/<smart-contract>.bin -a /path/to/<smart-contract>.abi -o /path/to/src/main/java -p com.your.organisation.name
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
        String[] args = new String[]{"solidity","generate",  binFile, abiFile, outputDir, packageDir};
        SolidityFunctionWrapperGenerator.main(args);
    }
}
