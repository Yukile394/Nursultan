package minecraft;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.chars.CharArraySet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public final class class04493 {
   private static final int u = 3;
   public static final char N = ' ';
   public static final MapCodec<class04493> y = class04491.L
      .flatXmap(class04493::N, var0 -> var0.B.<DataResult>map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Cannot encode unpacked recipe")));
   public static final class02362<class04247, class04493> L = class02362.N(
      class02389.B, var0 -> var0.i, class02389.B, var0 -> var0.R, class06510.field_52595.N_33(class02389.N()), var0 -> var0.M, class04493::N
   );
   private final int i;
   private final int R;
   private final List<Optional<class06510>> M;
   private final Optional<class04491> B;
   private final int Z;
   private final boolean z;

   public List<Optional<class06510>> L() {
      return this.M;
   }

   public class04493(int var1, int var2, List<Optional<class06510>> var3, Optional<class04491> var4) {
      super();
      this.i = var1;
      this.R = var2;
      this.M = var3;
      this.B = var4;
      this.Z = (int)var3.stream().flatMap(Optional::stream).count();
      this.z = class07536.N(var1, var2, var3);
   }

   public int y() {
      return this.R;
   }

   private static int y(String var0) {
      int ix = var0.length() - 1;

      while (ix >= 0 && var0.charAt(ix) == ' ') {
         ix--;
      }

      return ix;
   }

   private static DataResult<class04493> N(class04491 var0) {
      String[] astring = N(var0.y());
      int ix = astring[0].length();
      int j = astring.length;
      ArrayList arraylist = new ArrayList(ix * j);
      CharArraySet chararrayset = new CharArraySet(var0.N().keySet());

      for (String s : astring) {
         for (int k = 0; k < s.length(); k++) {
            char c0 = s.charAt(k);
            Optional optional;
            if (c0 == ' ') {
               optional = Optional.empty();
            } else {
               class06510 class06510 = var0.N().get(c0);
               if (class06510 == null) {
                  return DataResult.error(() -> "Pattern references symbol '" + c0 + "' but it's not defined in the key");
               }

               optional = Optional.of(class06510);
            }

            chararrayset.remove(c0);
            arraylist.add(optional);
         }
      }

      return !chararrayset.isEmpty()
         ? DataResult.error(() -> "Key defines symbols that aren't used in pattern: " + chararrayset)
         : DataResult.success(new class04493(ix, j, arraylist, Optional.of(var0)));
   }

   private static class04493 N(Integer var0, Integer var1, List<Optional<class06510>> var2) {
      return new class04493(var0, var1, var2, Optional.empty());
   }

   private boolean N(class02903 var1, boolean var2) {
      for (int ix = 0; ix < this.R; ix++) {
         for (int j = 0; j < this.i; j++) {
            Optional<class06510> optional;
            if (var2) {
               optional = this.M.get(this.i - j - 1 + ix * this.i);
            } else {
               optional = this.M.get(j + ix * this.i);
            }

            class06584 class06584 = var1.N(j, ix);
            if (!class06510.method_61676(optional, class06584)) {
               return false;
            }
         }
      }

      return true;
   }

   public boolean N(class02903 var1) {
      if (var1.i() != this.Z) {
         return false;
      } else {
         if (var1.R() == this.i && var1.M() == this.R) {
            if (!this.z && this.N(var1, true)) {
               return true;
            }

            if (this.N(var1, false)) {
               return true;
            }
         }

         return false;
      }
   }

   private static int N(String var0) {
      int ix = 0;

      while (ix < var0.length() && var0.charAt(ix) == ' ') {
         ix++;
      }

      return ix;
   }

   static String[] N(List<String> var0) {
      int ix = Integer.MAX_VALUE;
      int j = 0;
      int k = 0;
      int l = 0;

      for (int i1 = 0; i1 < var0.size(); i1++) {
         String s = (String)var0.get(i1);
         ix = Math.min(ix, N(s));
         int j1 = y(s);
         j = Math.max(j, j1);
         if (j1 < 0) {
            if (k == i1) {
               k++;
            }

            l++;
         } else {
            l = 0;
         }
      }

      if (var0.size() == l) {
         return new String[0];
      } else {
         String[] astring = new String[var0.size() - l - k];

         for (int k1 = 0; k1 < astring.length; k1++) {
            astring[k1] = ((String)var0.get(k1 + k)).substring(ix, j + 1);
         }

         return astring;
      }
   }

   public static class04493 N(Map<Character, class06510> var0, String... var1) {
      return N(var0, List.of(var1));
   }

   public static class04493 N(Map<Character, class06510> var0, List<String> var1) {
      return (class04493)N(new class04491(var0, var1)).getOrThrow();
   }

   public int N() {
      return this.i;
   }
}
