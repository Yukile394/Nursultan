package minecraft;

import com.mojang.blaze3d.systems.RenderSystem;
import org.joml.Matrix4fStack;

public class class08648 extends class08672<class08676> {
   public class08648(class01422 var1) {
      super(var1);
   }

   @Override
   protected String y() {
      return "player skin";
   }

   protected void N(class08676 var1, class01421 var2) {
      ((class03386)class06202.Nq().i_5).v().N(class01540.field_60029);
      int i = class06202.Nq().Nt().j();
      Matrix4fStack matrix4fstack = RenderSystem.getModelViewStack();
      matrix4fstack.pushMatrix();
      float f = var1.N() * i;
      matrix4fstack.rotateAround(class02058.y.N(var1.u()), 0.0F, f * -var1.U(), 0.0F);
      var2.N(class02058.u.N(-var1.z()));
      var2.N(0.0F, -1.6010001F, 0.0F);
      class07311 class07311 = var1.y().method_23500(var1.L());
      var1.y().method_60879(var2, this.N.method_73477(class07311), 15728880, class01384.u);
      this.N.u();
      matrix4fstack.popMatrix();
   }

   @Override
   public Class<class08676> N() {
      return class08676.class;
   }
}
