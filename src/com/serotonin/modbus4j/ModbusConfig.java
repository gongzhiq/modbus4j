package com.serotonin.modbus4j;

/**
 * Modbus配置
 */
public class ModbusConfig {

    private static boolean sEnableRtuCrc = true;

    public static boolean isEnableRtuCrc() {
        return sEnableRtuCrc;
    }

    public static void setEnableRtuCrc(boolean enableRtuCrc) {
        sEnableRtuCrc = enableRtuCrc;
    }
}
