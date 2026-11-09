package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectIterator;
import net.irisshaders.iris.mixin.fantastic.FeatureRenderDispatcherAccessor;

public class class08133 implements AutoCloseable, FeatureRenderDispatcherAccessor {
   private final class04790 N;
   private final class01999 y;
   private final class01422 L;
   private final class08117 u;
   private final class01434 i;
   private final class01422 R;
   private final class01590 M;
   private final class08128 B = new class08128();
   private final class08125 Z = new class08125();
   private final class08135 z = new class08135();
   private final class07921 U = new class07921();
   private final class08120 E = new class08120();
   private final class08105 W = new class08105();
   private final class08132 m = new class08132();
   private final class08144 P = new class08144();
   private final class08131 s = new class08131();
   private final class08123 T = new class08123();
   private final class00992 b = new class00992();

   public class04790 L() {
      return this.N;
   }

   public class08133(class04790 var1, class01999 var2, class01422 var3, class08117 var4, class01434 var5, class01422 var6, class01590 var7) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var5;
      this.R = var6;
      this.M = var7;
   }

   @Override
   public void close() {
      this.b.close();
   }

   public void y() {
      this.b.N();
   }

   public void N() {
      ObjectIterator<class07937> objectiterator = this.N.L().values().iterator();

      while (objectiterator.hasNext()) {
         class07937 class07937 = (class07937)objectiterator.next();
         this.B.N(class07937, this.L);
         this.z.N(class07937, this.L, this.i, this.R);
         this.U.N(class07937, this.L, this.i, this.R);
         this.Z.N(class07937, this.L, this.u);
         this.E.N(class07937, this.L, this.M);
         this.W.N(class07937, this.L);
         this.m.N(class07937, this.L);
         this.P.N(class07937, this.L, this.i);
         this.T.N(class07937, this.L, this.y, this.i);
         this.s.N(class07937, this.L);
         this.b.N(class07937);
      }

      this.N.N();
   }
}
