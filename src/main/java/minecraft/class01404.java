package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Objects;
import org.apache.commons.lang3.tuple.Triple;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public final class class01404 {
   private final Matrix4fc L;
   public static final Codec<class01404> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class06338.i.fieldOf("translation").forGetter(var0x -> var0x.i),
            class06338.z.fieldOf("left_rotation").forGetter(var0x -> var0x.R),
            class06338.i.fieldOf("scale").forGetter(var0x -> var0x.M),
            class06338.z.fieldOf("right_rotation").forGetter(var0x -> var0x.B)
         )
         .apply(var0, class01404::new)
   );
   public static final Codec<class01404> y = Codec.withAlternative(N, class06338.U.xmap(class01404::new, class01404::L));
   private boolean u;
   @Nullable
   private Vector3fc i;
   @Nullable
   private Quaternionfc R;
   @Nullable
   private Vector3fc M;
   @Nullable
   private Quaternionfc B;
   private static final class01404 Z = class07536.N(() -> {
      class01404 class01404 = new class01404(new Matrix4f());
      class01404.i = new Vector3f();
      class01404.R = new Quaternionf();
      class01404.M = new Vector3f(1.0F, 1.0F, 1.0F);
      class01404.B = new Quaternionf();
      class01404.u = true;
      return class01404;
   });

   public Matrix4fc L() {
      return this.L;
   }

   public Vector3fc M() {
      this.Z();
      return this.M;
   }

   public class01404(@Nullable Matrix4fc var1) {
      super();
      if (var1 == null) {
         this.L = new Matrix4f();
      } else {
         this.L = var1;
      }
   }

   public class01404(@Nullable Vector3fc var1, @Nullable Quaternionfc var2, @Nullable Vector3fc var3, @Nullable Quaternionfc var4) {
      super();
      this.L = N(var1, var2, var3, var4);
      this.i = (Vector3fc)(var1 != null ? var1 : new Vector3f());
      this.R = (Quaternionfc)(var2 != null ? var2 : new Quaternionf());
      this.M = (Vector3fc)(var3 != null ? var3 : new Vector3f(1.0F, 1.0F, 1.0F));
      this.B = (Quaternionfc)(var4 != null ? var4 : new Quaternionf());
      this.u = true;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         class01404 class01404 = (class01404)var1;
         return Objects.equals(this.L, class01404.L);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.L);
   }

   public Quaternionfc B() {
      this.Z();
      return this.B;
   }

   private void Z() {
      if (!this.u) {
         float f = 1.0F / this.L.m33();
         Triple<Quaternionf, Vector3f, Quaternionf> triple = class02054.N(new Matrix3f(this.L).scale(f));
         this.i = this.L.getTranslation(new Vector3f()).mul(f);
         this.R = new Quaternionf((Quaternionfc)triple.getLeft());
         this.M = new Vector3f((Vector3fc)triple.getMiddle());
         this.B = new Quaternionf((Quaternionfc)triple.getRight());
         this.u = true;
      }
   }

   public Vector3fc i() {
      this.Z();
      return this.i;
   }

   public Matrix4f u() {
      return new Matrix4f(this.L);
   }

   @Nullable
   public class01404 y() {
      if (this == Z) {
         return this;
      } else {
         Matrix4f matrix4f = this.u().invertAffine();
         return matrix4f.isFinite() ? new class01404(matrix4f) : null;
      }
   }

   public class01404 N(class01404 var1) {
      Matrix4f matrix4f = this.u();
      matrix4f.mul(var1.L());
      return new class01404(matrix4f);
   }

   public static class01404 N() {
      return Z;
   }

   private static Matrix4f N(@Nullable Vector3fc var0, @Nullable Quaternionfc var1, @Nullable Vector3fc var2, @Nullable Quaternionfc var3) {
      Matrix4f matrix4f = new Matrix4f();
      if (var0 != null) {
         matrix4f.translation(var0);
      }

      if (var1 != null) {
         matrix4f.rotate(var1);
      }

      if (var2 != null) {
         matrix4f.scale(var2);
      }

      if (var3 != null) {
         matrix4f.rotate(var3);
      }

      return matrix4f;
   }

   public class01404 N(class01404 var1, float var2) {
      return new class01404(
         this.i().lerp(var1.i(), var2, new Vector3f()),
         this.R().slerp(var1.R(), var2, new Quaternionf()),
         this.M().lerp(var1.M(), var2, new Vector3f()),
         this.B().slerp(var1.B(), var2, new Quaternionf())
      );
   }

   public Quaternionfc R() {
      this.Z();
      return this.R;
   }
}
