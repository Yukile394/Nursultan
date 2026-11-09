package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public abstract class class00201 {
   public static final Codec<class00201> y = class04206.NI.T().dispatch(class00201::N, var0 -> var0);
   private final class00195<class03556<class00225>> N;

   public class00392 L() {
      return this.P().y(this.s());
   }

   public int M() {
      return this.N.u();
   }

   protected class05216 P() {
      return this.N("test_instance.description.type", this.y());
   }

   public class00201(class00195<class03556<class00225>> var1) {
      super();
      this.N = var1;
   }

   public boolean B() {
      return this.N.i();
   }

   public boolean Z() {
      return this.N.M();
   }

   public class01894 i() {
      return this.N.y();
   }

   protected class00392 s() {
      return this.N("test_instance.description.structure", this.N.y().toString()).y(this.N("test_instance.description.batch", this.N.N().M()));
   }

   public class00195<class03556<class00225>> m() {
      return this.N;
   }

   public int U() {
      return this.N.Z();
   }

   public int z() {
      return this.N.B();
   }

   public class03556<class00225> u() {
      return this.N.N();
   }

   protected abstract class05216 y();

   public boolean E() {
      return this.N.z();
   }

   private static MapCodec<? extends class00201> N(class00751<MapCodec<? extends class00201>> var0, String var1, MapCodec<? extends class00201> var2) {
      return class00751.N(var0, class05946.N(class04227.No, class01894.y(var1)), var2);
   }

   protected class05216 N(String var1, String var2) {
      return this.N(var1, class00392.y(var2));
   }

   protected class05216 N(String var1, class05216 var2) {
      return class00392.N(var1, var2.N(class06541.field_1078)).y(class00392.y("\n"));
   }

   public static MapCodec<? extends class00201> N(class00751<MapCodec<? extends class00201>> var0) {
      N(var0, "block_based", class00200.N);
      return N(var0, "function", class00212.N);
   }

   public abstract void N(class05523 var1);

   public abstract MapCodec<? extends class00201> N();

   public class06993 W() {
      return this.N.R();
   }

   public int R() {
      return this.N.L();
   }
}
