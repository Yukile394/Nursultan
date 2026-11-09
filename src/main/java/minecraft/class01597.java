package minecraft;

import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class01597 extends class01598 {
   static final Logger N = LogUtils.getLogger();
   private final class01591 u;
   private final String i;

   class01597(class02267 var1, class01591 var2, String var3) {
      super(var1);
      this.u = var2;
      this.i = var3;
   }

   @Override
   public void close() {
      this.u.close();
   }

   @Nullable
   private class03652<InputStream> y(String var1) {
      ZipFile zipfile = this.u.N();
      if (zipfile == null) {
         return null;
      } else {
         ZipEntry zipentry = zipfile.getEntry(this.N(var1));
         return zipentry == null ? null : class03652.N(zipfile, zipentry);
      }
   }

   private static String N(class01603 var0, class01894 var1) {
      return String.format(Locale.ROOT, "%s/%s/%s", var0.N(), var1.y(), var1.N());
   }

   public static String N(String var0, String var1) {
      if (!var1.startsWith(var0)) {
         return "";
      } else {
         int ix = var0.length();
         int j = var1.indexOf(47, ix);
         return j == -1 ? var1.substring(ix) : var1.substring(ix, j);
      }
   }

   private String N(String var1) {
      return this.i.isEmpty() ? var1 : this.i + "/" + var1;
   }

   @Nullable
   @Override
   public class03652<InputStream> method_14410(String... var1) {
      return this.y(String.join("/", var1));
   }

   @Override
   public Set<String> method_14406(class01603 var1) {
      ZipFile zipfile = this.u.N();
      if (zipfile == null) {
         return Set.of();
      } else {
         Enumeration<? extends ZipEntry> enumeration = zipfile.entries();
         HashSet hashset = Sets.newHashSet();
         String s = this.N(var1.N() + "/");

         while (enumeration.hasMoreElements()) {
            String s1 = enumeration.nextElement().getName();
            String s2 = N(s, s1);
            if (!s2.isEmpty()) {
               if (class01894.z(s2)) {
                  hashset.add(s2);
               } else {
                  N.warn("Non [a-z0-9_.-] character in namespace {} in pack {}, ignoring", s2, this.u.N);
               }
            }
         }

         return hashset;
      }
   }

   @Override
   public class03652<InputStream> method_14405(class01603 var1, class01894 var2) {
      return this.y(N(var1, var2));
   }

   @Override
   public void method_14408(class01603 var1, String var2, String var3, class01593 var4) {
      ZipFile zipfile = this.u.N();
      if (zipfile != null) {
         Enumeration<? extends ZipEntry> enumeration = zipfile.entries();
         String s = this.N(var1.N() + "/" + var2 + "/");
         String s1 = s + var3 + "/";

         while (enumeration.hasMoreElements()) {
            ZipEntry zipentry = enumeration.nextElement();
            if (!zipentry.isDirectory()) {
               String s2 = zipentry.getName();
               if (s2.startsWith(s1)) {
                  String s3 = s2.substring(s.length());
                  class01894 class01894 = class01894.y(var2, s3);
                  if (class01894 != null) {
                     var4.accept(class01894, class03652.N(zipfile, zipentry));
                  } else {
                     N.warn("Invalid path in datapack: {}:{}, ignoring", var2, s3);
                  }
               }
            }
         }
      }
   }
}
