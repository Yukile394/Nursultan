package minecraft;

import com.viaversion.viafabricplus.features.limitation.max_chat_length.MaxChatLength;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;

public class class05018 {
   private static final Pattern N = Pattern.compile("(?i)\\u00A7[0-9A-FK-OR]");
   private static final Pattern y = Pattern.compile("\\r\\n|\\v");
   private static final Pattern L = Pattern.compile("(?:\\r\\n|\\v)$");

   public static int L(String var0) {
      if (var0.isEmpty()) {
         return 0;
      } else {
         Matcher matcher = y.matcher(var0);
         int i = 1;

         while (matcher.find()) {
            i++;
         }

         return i;
      }
   }

   public static String M(String var0) {
      return N(var0, false);
   }

   public class05018() {
      super();
   }

   public static boolean B(@Nullable String var0) {
      return var0 != null && !var0.isEmpty() ? var0.chars().allMatch(class05018::y) : true;
   }

   public static String i(String var0) {
      return N(var0, u(256), false);
   }

   private static int u(int var0) {
      return MaxChatLength.getChatLength();
   }

   public static boolean u(String var0) {
      return L.matcher(var0).find();
   }

   public static boolean y(@Nullable String var0) {
      return StringUtils.isEmpty(var0);
   }

   public static boolean y(int var0) {
      return Character.isWhitespace(var0) || Character.isSpaceChar(var0);
   }

   public static boolean N(int var0) {
      return var0 != 167 && var0 >= 32 && var0 != 127;
   }

   public static String N(int var0, float var1) {
      int i = class04995.y(var0 / var1);
      int j = i / 60;
      i %= 60;
      int k = j / 60;
      j %= 60;
      return k > 0 ? String.format(Locale.ROOT, "%02d:%02d:%02d", k, j, i) : String.format(Locale.ROOT, "%02d:%02d", j, i);
   }

   public static String N(String var0) {
      return N.matcher(var0).replaceAll("");
   }

   public static String N(String var0, int var1, boolean var2) {
      if (var0.length() <= var1) {
         return var0;
      } else {
         return var2 && var1 > 3 ? var0.substring(0, var1 - 3) + "..." : var0.substring(0, var1);
      }
   }

   public static String N(String var0, boolean var1) {
      StringBuilder stringbuilder = new StringBuilder();

      for (char c0 : var0.toCharArray()) {
         if (N(c0)) {
            stringbuilder.append(c0);
         } else if (var1 && c0 == '\n') {
            stringbuilder.append(c0);
         }
      }

      return stringbuilder.toString();
   }

   public static boolean R(String var0) {
      return var0.length() > 16 ? false : var0.chars().filter(var0x -> var0x <= 32 || var0x >= 127).findAny().isEmpty();
   }
}
