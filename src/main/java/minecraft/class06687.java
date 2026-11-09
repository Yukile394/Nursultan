package minecraft;

import java.util.UUID;

public abstract class class06687 {
   private final UUID B;
   protected class00392 N;
   protected float y;
   protected class06685 L;
   protected class06702 u;
   protected boolean i;
   protected boolean R;
   protected boolean M;

   public float L() {
      return this.y;
   }

   public class06687 L(boolean var1) {
      this.M = var1;
      return this;
   }

   public boolean M() {
      return this.R;
   }

   public class06687(UUID var1, class00392 var2, class06685 var3, class06702 var4) {
      super();
      this.B = var1;
      this.N = var2;
      this.L = var3;
      this.u = var4;
      this.y = 1.0F;
   }

   public boolean B() {
      return this.M;
   }

   public class06702 i() {
      return this.u;
   }

   public class06685 u() {
      return this.L;
   }

   public class06687 y(boolean var1) {
      this.R = var1;
      return this;
   }

   public class00392 y() {
      return this.N;
   }

   public UUID N() {
      return this.B;
   }

   public class06687 N(boolean var1) {
      this.i = var1;
      return this;
   }

   public void N(class06685 var1) {
      this.L = var1;
   }

   public void N(class00392 var1) {
      this.N = var1;
   }

   public void N(class06702 var1) {
      this.u = var1;
   }

   public void N(float var1) {
      this.y = var1;
   }

   public boolean R() {
      return this.i;
   }
}
