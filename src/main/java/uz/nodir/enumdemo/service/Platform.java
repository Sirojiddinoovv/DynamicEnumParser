package uz.nodir.enumdemo.service;


import uz.nodir.enumdemo.dto.core.Simple;
import uz.nodir.enumdemo.enums.PlatformType;

/**
 * @author: PC
 * @date: 02.03.2025
 * @group: DavrCoders
 **/

public interface Platform {
    String value();

    static Platform of(String value) {
        try {
            return PlatformType.parse(value);
        } catch (IllegalArgumentException e) {
            return new Simple(value);
        }
    }

}
