package minecraft;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;

public enum class07533 {
   field_1135("linux"),
   field_1134("solaris"),
   field_1133("WINDOWS", 2, "windows"),
   field_1137("OSX", 3, "mac"),
   field_1132("unknown");

   private final String field_34894;

   class07533(String var3) {
      this.field_34894 = var3;
   }

   protected String[] y(URI var1) {
      String s = var1.toString();
      if ("file".equals(var1.getScheme())) {
         s = s.replace("file:", "file://");
      }

      return new String[]{"xdg-open", s};
   }

   public String N() {
      return this.field_34894;
   }

   public void N(Path var1) {
      this.N(var1.toUri());
   }

   public void N(String var1) {
      try {
         this.N(new URI(var1));
      } catch (IllegalArgumentException | URISyntaxException urisyntaxexception) {
         class07536.N.error("Couldn't open uri '{}'", var1, urisyntaxexception);
      }
   }

   public void N(File var1) {
      this.N(var1.toURI());
   }

   public void N(URI var1) {
      try {
         Process process = Runtime.getRuntime().exec(this.y(var1));
         process.getInputStream().close();
         process.getErrorStream().close();
         process.getOutputStream().close();
      } catch (IOException ioexception) {
         class07536.N.error("Couldn't open location '{}'", var1, ioexception);
      }
   }
}
