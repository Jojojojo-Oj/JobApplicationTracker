package jobapplicationtracker.config;

import java.awt.Font;
import java.io.InputStream;

public class FontConfig {

    public static Font loadInter(String fontFile, float size) {

        String path = "/jobapplicationtracker/resources/fonts/" + fontFile;

        try (InputStream is = FontConfig.class.getResourceAsStream(path)) {

            if (is == null) {
                System.out.println("FILE NOT FOUND: " + path);
                return new Font("SansSerif", Font.PLAIN, (int) size);
            }

            System.out.println("FILE FOUND: " + path);
            System.out.println("FILE SIZE: " + is.available());

            Font font = Font.createFont(Font.TRUETYPE_FONT, is);

            System.out.println("SUCCESS: " + font.getFontName());

            return font.deriveFont(size);

        } catch (Exception e) {
            System.out.println("FONT ERROR: " + e.getMessage());
            e.printStackTrace();

            return new Font("SansSerif", Font.PLAIN, (int) size);
        }
    }
}