package com.example.holiday;

import org.dizitart.no2.Nitrite;
import org.junit.jupiter.api.Test;

public class DataBaseTest {
    @Test
    void connection(){
        Nitrite db = Nitrite.builder()
                .compressed()
                .filePath("C:\\Users\\User\\Desktop\\Fis Project\\Holiday\\src\\main\\resources\\tmp\\test.db")
                .openOrCreate();
    }
}
