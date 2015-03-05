package org.esa.beam.framework.gpf.operators.tooladapter;

import java.io.File;

/**
 * @author Lucian Barbulescu.
 */
public interface ToolAdapterConstants {

    public static final String OPERATOR_NAMESPACE = "org.esa.beam.framework.gpf.operators.tooladapter.";
    public static String DESCRIPTOR_FILE = "META-INF" + File.separator + "descriptor.xml";
    public static String SPI_FILE = "META-INF" + File.separator + "services" + File.separator + "org.esa.beam.framework.gpf.OperatorSpi";
    public static String SPI_FILE_CONTENT = OPERATOR_NAMESPACE + ".ToolAdapterOpSpi";
    /**
     * The root folder for the tool adapter descriptors.
     */
    public static final String FAILSAFE_MODULE_FOLDER = "META-INF" + File.separator + "services" + File.separator + "tools" + File.separator;

    /**
     * The id of the tool's source product.
     */
    public static final String TOOL_SOURCE_PRODUCT_ID = "sourceProduct";
    public static final String TOOL_TARGET_PRODUCT_ID = "targetProduct";
    public static final String TOOL_SOURCE_PRODUCT_FILE = "sourceProductFile";
    public static final String TOOL_TARGET_PRODUCT_FILE = "targetProductFile";
    /**
     * The id of the tool's target file as it is used in the descriptor.
     */
    public static final String OPERATOR_GENERATED_NAME_SEPARATOR = "_";
    public static String TOOL_VELO_TEMPLATE_SUFIX = "-template.vm";
    public static String TOOL_CMD_TEMPLATE_SUFIX = "-cmdLineTemplate.tpl";
}
