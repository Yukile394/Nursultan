package minecraft;

import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class class03948 extends class03709<class03399> {
   private static final class00392 m = class00392.L("gui.chatReport.title");
   private static final class00392 P = class00392.L("gui.chatReport.select_chat");
   private class03943 s;
   private class05362 T;
   private class05362 b;

   public class03948(class05096 var1, class03409 var2, class03406 var3) {
      this(var1, var2, new class03399(var3, var2.N().y()));
   }

   public class03948(class05096 var1, class03409 var2, UUID var3) {
      this(var1, var2, new class03399(var3, var2.N().y()));
   }

   private class03948(class05096 var1, class03409 var2, class03399 var3) {
      super(m, var1, var2, var3);
   }

   @Override
   protected void y() {
      IntSet intset = this.E.N();
      if (intset.isEmpty()) {
         this.T.method_25355(P);
      } else {
         this.T.method_25355(class00392.N("gui.chatReport.selected_chat", intset.size()));
      }

      class03380 class03380 = this.E.Z();
      if (class03380 != null) {
         this.b.method_25355(class03380.y());
      } else {
         this.b.method_25355(L);
      }

      super.y();
   }

   @Override
   protected void N() {
      this.T = this.U.N(class05362.method_46430(P, var1 -> this.field_22787.N(new class03417(this, this.z, this.E, var1x -> {
         this.E = var1x;
         this.y();
      }))).N(280).N());
      this.b = class05362.method_46430(L, var1 -> this.field_22787.N(new class03418(this, this.E.Z(), class03752.field_46064, var1x -> {
         this.E.N(var1x);
         this.y();
      }))).N(280).N();
      this.U.N(class03725.N(this.field_22793, this.b, y));
      this.s = this.N(280, 72, var1 -> {
         this.E.N(var1);
         this.y();
      });
      this.U.N(class03725.N(this.field_22793, this.s, u, var0 -> var0.i(12)));
   }

   @Override
   public boolean method_25406(class06613 var1) {
      return super.method_25406(var1) ? true : this.s.method_25406(var1);
   }
}
