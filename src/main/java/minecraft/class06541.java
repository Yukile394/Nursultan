package minecraft;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public enum class06541 implements class05033 {
   field_1074("BLACK", '0', 0, 0),
   field_1058("DARK_BLUE", '1', 1, 170),
   field_1077("DARK_GREEN", '2', 2, 43520),
   field_1062("DARK_AQUA", '3', 3, 43690),
   field_1079("DARK_RED", '4', 4, 11141120),
   field_1064("DARK_PURPLE", '5', 5, 11141290),
   field_1065("GOLD", '6', 6, 16755200),
   field_1080("GRAY", '7', 7, 11184810),
   field_1063("DARK_GRAY", '8', 8, 5592405),
   field_1078("BLUE", '9', 9, 5592575),
   field_1060("GREEN", 'a', 10, 5635925),
   field_1075("AQUA", 'b', 11, 5636095),
   field_1061("RED", 'c', 12, 16733525),
   field_1076("LIGHT_PURPLE", 'd', 13, 16733695),
   field_1054("YELLOW", 'e', 14, 16777045),
   field_1068("WHITE", 'f', 15, 16777215),
   field_1051("OBFUSCATED", 'k', true),
   field_1067("BOLD", 'l', true),
   field_1055("STRIKETHROUGH", 'm', true),
   field_1073("UNDERLINE", 'n', true),
   field_1056("ITALIC", 'o', true),
   field_1070("RESET", 'r', -1, null);

   public static final Codec<class06541> field_39218 = class05033.N(class06541::values);
   public static final Codec<class06541> field_56511 = field_39218.validate(
      var0 -> var0.L() ? DataResult.error(() -> "Formatting was not a valid color: " + var0) : DataResult.success(var0)
   );
   public static final char field_33292 = '§';
   private static final Map<String, class06541> field_1052 = Arrays.stream(values())
      .collect(Collectors.toMap(var0 -> L(var0.field_1057), var0 -> (class06541)var0));
   private static final Pattern field_1066 = Pattern.compile("(?i)§[0-9A-FK-OR]");
   private final String field_1057;
   private final char field_1059;
   private final boolean field_1081;
   private final String field_1069;
   private final int field_1071;
   @Nullable
   private final Integer field_1053;

   private static String L(String var0) {
      return var0.toLowerCase(Locale.ROOT).replaceAll("[^a-z]", "");
   }

   public boolean L() {
      return this.field_1081;
   }

   private class06541(String var3, char var4, boolean var5, int var6, @Nullable Integer var7) {
      this.field_1057 = var3;
      this.field_1059 = var4;
      this.field_1081 = var5;
      this.field_1071 = var6;
      this.field_1053 = var7;
      this.field_1069 = "§" + var4;
   }

   private class06541(String var3, char var4, boolean var5) {
      this(var3, var4, var5, -1, null);
   }

   private class06541(String var3, char var4, int var5, @Nullable Integer var6) {
      this(var3, var4, false, var5, var6);
   }

   @Override
   public String toString() {
      return this.field_1069;
   }

   @Nullable
   public Integer i() {
      return this.field_1053;
   }

   public boolean u() {
      return !this.field_1081 && this != field_1070;
   }

   public int y() {
      return this.field_1071;
   }

   @Nullable
   public static class06541 y(@Nullable String var0) {
      return var0 == null ? null : field_1052.get(L(var0));
   }

   public char N() {
      return this.field_1059;
   }

   public static Collection<String> N(boolean var0, boolean var1) {
      ArrayList arraylist = Lists.newArrayList();

      for (class06541 class06541 : values()) {
         if ((!class06541.u() || var0) && (!class06541.L() || var1)) {
            arraylist.add(class06541.R());
         }
      }

      return arraylist;
   }

   @Nullable
   public static class06541 N(int var0) {
      if (var0 < 0) {
         return field_1070;
      } else {
         for (class06541 class06541 : values()) {
            if (class06541.y() == var0) {
               return class06541;
            }
         }

         return null;
      }
   }

   @Nullable
   public static String N(@Nullable String var0) {
      return var0 == null ? null : field_1066.matcher(var0).replaceAll("");
   }

   @Nullable
   public static class06541 N(char var0) {
      char c0 = Character.toLowerCase(var0);

      for (class06541 class06541 : values()) {
         if (class06541.field_1059 == c0) {
            return class06541;
         }
      }

      return null;
   }

   public String R() {
      return this.name().toLowerCase(Locale.ROOT);
   }

   @Override
   public String method_15434() {
      return this.R();
   }
}
