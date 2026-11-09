package minecraft;

public class class02406 {
   private final class00392 N;
   private final class00392 y;
   private final class00392 L;
   private final class06672 u;
   private final class06656 i;
   private final class06541 R;
   private final int M;

   public class06541 L() {
      return this.R;
   }

   public class00392 M() {
      return this.L;
   }

   public class02406(class04247 var1) {
      super();
      this.N = class03748.u.decode(var1);
      this.M = var1.readByte();
      this.u = class06672.field_56490.decode(var1);
      this.i = class06656.field_56487.decode(var1);
      this.R = var1.y(class06541.class);
      this.y = class03748.u.decode(var1);
      this.L = class03748.u.decode(var1);
   }

   public class02406(class00502 var1) {
      super();
      this.N = var1.u();
      this.M = var1.m();
      this.u = var1.U();
      this.i = var1.W();
      this.R = var1.P();
      this.y = var1.R();
      this.L = var1.M();
   }

   public class06656 i() {
      return this.i;
   }

   public class06672 u() {
      return this.u;
   }

   public int y() {
      return this.M;
   }

   public void N(class04247 var1) {
      class03748.u.encode(var1, this.N);
      var1.writeByte(this.M);
      class06672.field_56490.encode(var1, this.u);
      class06656.field_56487.encode(var1, this.i);
      var1.N(this.R);
      class03748.u.encode(var1, this.y);
      class03748.u.encode(var1, this.L);
   }

   public class00392 N() {
      return this.N;
   }

   public class00392 R() {
      return this.y;
   }
}
