package minecraft;

import java.util.function.Supplier;
import org.joml.Matrix4f;

public class class06835 {
   public static final double N = 8.0;
   private final String R;
   private final Supplier<Matrix4f> M;
   public static final class06835 y = new class06835("default_texturing", Matrix4f::new);
   public static final class06835 L = new class06835("glint_texturing", () -> N(8.0F));
   public static final class06835 u = new class06835("entity_glint_texturing", () -> N(0.5F));
   public static final class06835 i = new class06835("armor_entity_glint_texturing", () -> N(0.16F));

   public class06835(String var1, Supplier<Matrix4f> var2) {
      super();
      this.R = var1;
      this.M = var2;
   }

   @Override
   public String toString() {
      return "TexturingStateShard[" + this.R + "]";
   }

   private static Matrix4f N(float var0) {
      long ix = (long)(class07536.L() * ((class05630)class06202.Nq().i_7).Ng().method_41753() * 8.0);
      float f = (float)(ix % 110000L) / 110000.0F;
      float f1 = (float)(ix % 30000L) / 30000.0F;
      Matrix4f matrix4f = new Matrix4f().translation(-f, f1, 0.0F);
      matrix4f.rotateZ((float) (Math.PI / 18)).scale(var0);
      return matrix4f;
   }

   public Matrix4f N() {
      return this.M.get();
   }
}
