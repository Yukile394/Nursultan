package minecraft;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Optional;

public record class07707(String value) implements class08884 {
   private static final int L = 36;
   public static final class01424<class07707> N = new class07738();
   private static final class07707 t = new class07707("");
   private static final char G = '"';
   private static final char l = '\'';
   private static final char d = '\\';
   private static final char w = '\u0000';

   @Override
   public byte L() {
      return 8;
   }

   public static String L(String var0) {
      StringBuilder stringbuilder = new StringBuilder();
      y(var0, stringbuilder);
      return stringbuilder.toString();
   }

   @Deprecated(
      forRemoval = true
   )
   public class07707(String value) {
      super();
      this.value = value;
   }

   @Override
   public String toString() {
      class04818 class04818 = new class04818();
      class04818.N(this);
      return class04818.N();
   }

   public class07707 N() {
      return this;
   }

   public String U() {
      return this.value;
   }

   @Override
   public class01424<class07707> u() {
      return N;
   }

   public static void y(String var0, StringBuilder var1) {
      for (int i = 0; i < var0.length(); i++) {
         char c0 = var0.charAt(i);
         switch (c0) {
            case '"':
            case '\'':
            case '\\':
               var1.append('\\');
               var1.append(c0);
               break;
            default:
               String s = class08876.N(c0);
               if (s != null) {
                  var1.append('\\');
                  var1.append(s);
               } else {
                  var1.append(c0);
               }
         }
      }
   }

   public static String y(String var0) {
      StringBuilder stringbuilder = new StringBuilder();
      N(var0, stringbuilder);
      return stringbuilder.toString();
   }

   @Override
   public int y() {
      return 36 + 2 * this.value.length();
   }

   @Override
   public class03154 N(class03175 var1) {
      return var1.N(this.value);
   }

   @Override
   public void N(class04836 var1) {
      var1.N(this);
   }

   @Override
   public void N(DataOutput var1) throws IOException {
      var1.writeUTF(this.value);
   }

   public static class07707 N(String var0) {
      return var0.isEmpty() ? t : new class07707(var0);
   }

   public static void N(String var0, StringBuilder var1) {
      int i = var1.length();
      var1.append(' ');
      int j = 0;

      for (int k = 0; k < var0.length(); k++) {
         char c0 = var0.charAt(k);
         if (c0 == '\\') {
            var1.append("\\\\");
         } else if (c0 != '"' && c0 != '\'') {
            String s = class08876.N(c0);
            if (s != null) {
               var1.append('\\');
               var1.append(s);
            } else {
               var1.append(c0);
            }
         } else {
            if (j == 0) {
               j = c0 == '"' ? 39 : 34;
            }

            if (j == c0) {
               var1.append('\\');
            }

            var1.append(c0);
         }
      }

      if (j == 0) {
         j = 34;
      }

      var1.setCharAt(i, (char)j);
      var1.append((char)j);
   }

   public static void N(DataInput var0) throws IOException {
      var0.skipBytes(var0.readUnsignedShort());
   }

   @Override
   public Optional<String> ah_() {
      return Optional.of(this.value);
   }
}
