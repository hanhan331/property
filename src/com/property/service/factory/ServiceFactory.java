package com.property.service.factory;

import com.property.service.impl.SysService;
import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;

import java.util.zip.Deflater;

public class ServiceFactory {
    public static Object getInstance(String name) {
        switch (name) {
            case "SYS":
                return new SysService();
            default:
                return null;
        }
    }

}
