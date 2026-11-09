package minecraft;

import Nursultan.class10568;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.bytes.ByteArrayList;
import it.unimi.dsi.fastutil.bytes.ByteList;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.IntBuffer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class06268 implements class06262 {
   static final Logger N = LogUtils.getLogger();
   private static final int L = 16;
   private static final int u = 2;
   private static final int i = 32;
   private static final int R = 64;
   private static final int M = 96;
   private static final int B = 128;
   private final class03475<class06248> Z;

   class06268(class03475<class06248> var1) {
      super();
      this.Z = var1;
   }

   static int N(int var0, ByteList var1, int var2) {
      return N(var0, var1.getByte(var2));
   }

   private static int N(int var0, byte var1) {
      return switch (var1) {
         case 48 -> 0;
         case 49 -> 1;
         case 50 -> 2;
         case 51 -> 3;
         case 52 -> 4;
         case 53 -> 5;
         case 54 -> 6;
         case 55 -> 7;
         case 56 -> 8;
         case 57 -> 9;
         default -> throw new IllegalArgumentException("Invalid entry at line " + var0 + ": expected hex digit, got " + (char)var1);
         case 65 -> 10;
         case 66 -> 11;
         case 67 -> 12;
         case 68 -> 13;
         case 69 -> 14;
         case 70 -> 15;
      };
   }

   private static boolean N(InputStream var0, ByteList var1, int var2) throws IOException {
      while (true) {
         int ix = var0.read();
         if (ix == -1) {
            return false;
         }

         if (ix == var2) {
            return true;
         }

         var1.add((byte)ix);
      }
   }

   static void N(InputStream var0, class10568 var1) throws IOException {
      int ix = 0;
      ByteArrayList bytearraylist = new ByteArrayList(128);

      while (true) {
         boolean flag = N(var0, bytearraylist, 58);
         int j = bytearraylist.size();
         if (j == 0 && !flag) {
            return;
         }

         if (!flag || j != 4 && j != 5 && j != 6) {
            throw new IllegalArgumentException("Invalid entry at line " + ix + ": expected 4, 5 or 6 hex digits followed by a colon");
         }

         int k = 0;

         for (int l = 0; l < j; l++) {
            k = k << 4 | N(ix, bytearraylist.getByte(l));
         }

         bytearraylist.clear();
         N(var0, bytearraylist, 10);
         int i1 = bytearraylist.size();

         class06267 class06267 = switch (i1) {
            case 32 -> class06255.N(ix, bytearraylist);
            case 64 -> class06258.N(ix, bytearraylist);
            case 96 -> class06253.N(ix, bytearraylist);
            case 128 -> class06253.y(ix, bytearraylist);
            default -> throw new IllegalArgumentException(
               "Invalid entry at line " + ix + ": expected hex number describing (8,16,24,32) x 16 bitmap, followed by a new line"
            );
         };
         var1.accept(k, class06267);
         ix++;
         bytearraylist.clear();
      }
   }

   @Override
   public IntSet N() {
      return this.Z.y();
   }

   static void N(IntBuffer var0, int var1, int var2, int var3) {
      int ix = 32 - var2 - 1;
      int j = 32 - var3 - 1;

      for (int k = ix; k >= j; k--) {
         if (k < 32 && k >= 0) {
            boolean flag = (var1 >> k & 1) != 0;
            var0.put(flag ? -1 : 0);
         } else {
            var0.put(0);
         }
      }
   }

   static void N(IntBuffer var0, class06267 var1, int var2, int var3) {
      for (int ix = 0; ix < 16; ix++) {
         int j = var1.N(ix);
         N(var0, j, var2, var3);
      }
   }

   @Nullable
   @Override
   public class00947 N(int var1) {
      return this.Z.N(var1);
   }
}
