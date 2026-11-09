package minecraft;

import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jspecify.annotations.Nullable;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.glfw.GLFWVidMode.Buffer;

public final class class04760 {
   private final int N;
   private final int y;
   private final int L;
   private final int u;
   private final int i;
   private final int R;
   private static final Pattern M = Pattern.compile("(\\d+)x(\\d+)(?:@(\\d+)(?::(\\d+))?)?");

   public int L() {
      return this.L;
   }

   public String M() {
      return String.format(Locale.ROOT, "%sx%s@%s:%s", this.N, this.y, this.R, this.L + this.u + this.i);
   }

   public class04760(int var1, int var2, int var3, int var4, int var5, int var6) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var5;
      this.R = var6;
   }

   public class04760(Buffer var1) {
      super();
      this.N = var1.width();
      this.y = var1.height();
      this.L = var1.redBits();
      this.u = var1.greenBits();
      this.i = var1.blueBits();
      this.R = var1.refreshRate();
   }

   public class04760(GLFWVidMode var1) {
      super();
      this.N = var1.width();
      this.y = var1.height();
      this.L = var1.redBits();
      this.u = var1.greenBits();
      this.i = var1.blueBits();
      this.R = var1.refreshRate();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         class04760 class04760 = (class04760)var1;
         return this.N == class04760.N
            && this.y == class04760.y
            && this.L == class04760.L
            && this.u == class04760.u
            && this.i == class04760.i
            && this.R == class04760.R;
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "%sx%s@%s (%sbit)", this.N, this.y, this.R, this.L + this.u + this.i);
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.N, this.y, this.L, this.u, this.i, this.R);
   }

   public int i() {
      return this.i;
   }

   public int u() {
      return this.u;
   }

   public int y() {
      return this.y;
   }

   public int N() {
      return this.N;
   }

   public static Optional<class04760> N(@Nullable String var0) {
      if (var0 == null) {
         return Optional.empty();
      } else {
         try {
            Matcher matcher = M.matcher(var0);
            if (matcher.matches()) {
               int ix = Integer.parseInt(matcher.group(1));
               int j = Integer.parseInt(matcher.group(2));
               String s = matcher.group(3);
               int k;
               if (s == null) {
                  k = 60;
               } else {
                  k = Integer.parseInt(s);
               }

               String s1 = matcher.group(4);
               int l;
               if (s1 == null) {
                  l = 24;
               } else {
                  l = Integer.parseInt(s1);
               }

               int i1 = l / 3;
               return Optional.of(new class04760(ix, j, i1, i1, i1, k));
            }
         } catch (Exception exception) {
         }

         return Optional.empty();
      }
   }

   public int R() {
      return this.R;
   }
}
