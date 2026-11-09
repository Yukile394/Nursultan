package minecraft;

import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class class04638 {
   private final String N;
   @Nullable
   private final String y;
   @Nullable
   private final String L;

   public String L() {
      if (!this.y()) {
         throw new IllegalStateException("Not a link: " + this);
      } else {
         return this.L;
      }
   }

   private class04638(String var1, @Nullable String var2, @Nullable String var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   private class04638(String var1) {
      super();
      this.N = var1;
      this.y = null;
      this.L = null;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         class04638 class04638 = (class04638)var1;
         return Objects.equals(this.N, class04638.N) && Objects.equals(this.y, class04638.y) && Objects.equals(this.L, class04638.L);
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "Segment{fullText='" + this.N + "', linkTitle='" + this.y + "', linkUrl='" + this.L + "'}";
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.N, this.y, this.L);
   }

   public boolean y() {
      return this.y != null;
   }

   public static class04638 N(String var0, String var1) {
      return new class04638(null, var0, var1);
   }

   protected static class04638 N(String var0) {
      return new class04638(var0);
   }

   public String N() {
      return this.y() ? this.y : this.N;
   }
}
