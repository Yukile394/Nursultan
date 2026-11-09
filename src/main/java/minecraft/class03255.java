package minecraft;

import org.joml.Matrix3x2fc;
import org.joml.Vector2f;
import org.jspecify.annotations.Nullable;

public record class03255(class03283 position, int width, int height) {
   private static final class03255 u = new class03255(0, 0, 0, 0);

   public boolean L(class03255 var1) {
      return this.u() < var1.i() && this.i() > var1.u() && this.y() < var1.L() && this.L() > var1.y();
   }

   public class03255 L(class03249 var1) {
      int i = this.y(var1);
      class03287 class03287 = var1.N().N();
      int j = this.y(class03287.L());
      int k = this.N(class03287);
      return N(var1.N(), i, j, 1, k).N(var1);
   }

   public int L() {
      return this.position.y() + this.height;
   }

   public int M() {
      return this.width;
   }

   public class03255(int var1, int var2, int var3, int var4) {
      this(new class03283(var1, var2), var3, var4);
   }

   public class03255(class03283 position, int width, int height) {
      this.position = position;
      this.width = width;
      this.height = height;
   }

   public int B() {
      return this.height;
   }

   public int i() {
      return this.position.N() + this.width;
   }

   public int u() {
      return this.position.N();
   }

   public boolean u(class03255 var1) {
      return var1.u() >= this.u() && var1.y() >= this.y() && var1.i() <= this.i() && var1.L() <= this.L();
   }

   public int y(class03249 var1) {
      class03287 class03287 = var1.N();
      return var1.L() ? this.position.N(class03287) + this.N(class03287) - 1 : this.position.N(class03287);
   }

   public int y() {
      return this.position.y();
   }

   public class03255 y(Matrix3x2fc var1) {
      Vector2f vector2f = var1.transformPosition(this.u(), this.y(), new Vector2f());
      Vector2f vector2f1 = var1.transformPosition(this.i(), this.y(), new Vector2f());
      Vector2f vector2f2 = var1.transformPosition(this.u(), this.L(), new Vector2f());
      Vector2f vector2f3 = var1.transformPosition(this.i(), this.L(), new Vector2f());
      float f = Math.min(Math.min(vector2f.x(), vector2f2.x()), Math.min(vector2f1.x(), vector2f3.x()));
      float f1 = Math.max(Math.max(vector2f.x(), vector2f2.x()), Math.max(vector2f1.x(), vector2f3.x()));
      float f2 = Math.min(Math.min(vector2f.y(), vector2f2.y()), Math.min(vector2f1.y(), vector2f3.y()));
      float f3 = Math.max(Math.max(vector2f.y(), vector2f2.y()), Math.max(vector2f1.y(), vector2f3.y()));
      return new class03255(class04995.y(f), class04995.y(f2), class04995.u(f1 - f), class04995.u(f3 - f2));
   }

   public int y(class03287 var1) {
      return (this.y(var1.y()) + this.y(var1.L())) / 2;
   }

   @Nullable
   public class03255 y(class03255 var1) {
      int i = Math.max(this.u(), var1.u());
      int j = Math.max(this.y(), var1.y());
      int k = Math.min(this.i(), var1.i());
      int l = Math.min(this.L(), var1.L());
      return i < k && j < l ? new class03255(i, j, k - i, l - j) : null;
   }

   public static class03255 N(class03287 var0, int var1, int var2, int var3, int var4) {
      return switch (var0) {
         case field_41822 -> new class03255(var1, var2, var3, var4);
         case field_41823 -> new class03255(var2, var1, var4, var3);
      };
   }

   public static class03255 N() {
      return u;
   }

   public boolean N(class03255 var1, class03287 var2) {
      int i = this.y(var2.L());
      int j = var1.y(var2.L());
      int k = this.y(var2.y());
      int l = var1.y(var2.y());
      return Math.max(i, j) <= Math.min(k, l);
   }

   public boolean N(class03255 var1) {
      return this.N(var1, class03287.field_41822) && this.N(var1, class03287.field_41823);
   }

   public boolean N(int var1, int var2) {
      return var1 >= this.u() && var1 < this.i() && var2 >= this.y() && var2 < this.L();
   }

   public class03255 N(Matrix3x2fc var1) {
      Vector2f vector2f = var1.transformPosition(this.u(), this.y(), new Vector2f());
      Vector2f vector2f1 = var1.transformPosition(this.i(), this.L(), new Vector2f());
      return new class03255(class04995.y(vector2f.x), class04995.y(vector2f.y), class04995.y(vector2f1.x - vector2f.x), class04995.y(vector2f1.y - vector2f.y));
   }

   public class03255 N(class03249 var1) {
      return new class03255(this.position.N(var1), this.width, this.height);
   }

   public int N(class03287 var1) {
      return switch (var1) {
         case field_41822 -> this.width;
         case field_41823 -> this.height;
      };
   }

   public class03283 R() {
      return this.position;
   }
}
