package minecraft;

import com.google.common.collect.Queues;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class06086 {
   private static final int y = 5;
   private static final int L = -1;
   final class06202 N;
   private final List<class06131<?>> u = new ArrayList<>();
   private final BitSet i = new BitSet(5);
   private final Deque<class04680> R = Queues.newArrayDeque();
   private final Set<class04891> M = new HashSet<>();
   private class06131<class00108> B;

   public void L() {
      if (this.B != null) {
         this.B.y();
         this.B.N().N((class05630)this.N.i_7);
      }
   }

   private int M() {
      return 5 - this.i.cardinality();
   }

   public class06086(class06202 var1, class05630 var2) {
      super();
      this.N = var1;
      this.y(var2.NX().method_41753());
   }

   public class06202 i() {
      return this.N;
   }

   public void u() {
      if (this.B != null) {
         this.B.N().N(class04650.field_2209);
      }
   }

   private void y(class06535 var1) {
      switch (class06102.N[var1.ordinal()]) {
         case 1:
         case 2:
            this.B = new class06131<>(this, (int)(new class00108()), 0, 0);
      }
   }

   public void y() {
      this.i.clear();
      this.u.clear();
      this.R.clear();
   }

   public void N(class04680 var1, CallbackInfo var2) {
      if (!SodiumExtraClientMod.options().extraSettings.toasts
         || !SodiumExtraClientMod.options().extraSettings.tutorialToast && var1 instanceof class06128
         || !SodiumExtraClientMod.options().extraSettings.systemToast && var1 instanceof class06132
         || !SodiumExtraClientMod.options().extraSettings.recipeToast && var1 instanceof class04658
         || !SodiumExtraClientMod.options().extraSettings.advancementToast && var1 instanceof class04683) {
         var2.cancel();
      }
   }

   public void N(class06535 var1) {
      switch (class06102.N[var1.ordinal()]) {
         case 1:
            this.B = new class06131<>(this, (int)(new class00108()), 0, 0);
            break;
         case 2:
            this.B = new class06131<>(this, (int)(new class00108()), 0, 0);
            if (((class05630)this.N.i_7).N(class04911.field_15253) > 0.0F) {
               this.B.N().N((class05630)this.N.i_7);
            }
            break;
         case 3:
            this.B = null;
      }
   }

   @Nullable
   public <T extends class04680> T N(Class<? extends T> var1, Object var2) {
      for (class06131<?> class06131 : this.u) {
         if (var1.isAssignableFrom(class06131.N().getClass()) && class06131.N().R().equals(var2)) {
            return (T)class06131.N();
         }
      }

      for (class04680 class04680 : this.R) {
         if (var1.isAssignableFrom(class04680.getClass()) && class04680.R().equals(var2)) {
            return (T)class04680;
         }
      }

      return null;
   }

   public void N(class01054 var1) {
      if (!((class05630)this.N.i_7).NG) {
         int ix = var1.N();
         if (!this.u.isEmpty()) {
            var1.L();
         }

         Iterator<class06131<?>> iterator = this.u.iterator();

         while (iterator.hasNext()) {
            iterator.next().N(var1, ix);
         }

         if (((class05630)this.N.i_7).NX().method_41753().u()
            && this.B != null
            && ((class05096)this.N.v_3 == null || !((class05096)this.N.v_3 instanceof class05123))) {
            this.B.N(var1, ix);
         }
      }
   }

   public void N() {
      MutableBoolean mutableboolean = new MutableBoolean(false);
      this.u.removeIf(var2 -> {
         class04650 class04650 = var2.L;
         var2.u();
         if (var2.L != class04650 && mutableboolean.isFalse()) {
            mutableboolean.setTrue();
            var2.L.N(this.N.Nr());
         }

         if (var2.L()) {
            this.i.clear(var2.N, var2.N + var2.y);
            return true;
         } else {
            return false;
         }
      });
      if (!this.R.isEmpty() && this.M() > 0) {
         this.R.removeIf(var1x -> {
            int ix = var1x.M();
            int j = this.N(ix);
            if (j == -1) {
               return false;
            } else {
               this.u.add(new class06131(this, (int)var1x, j, ix));
               this.i.set(j, j + ix);
               class04891 class04891 = var1x.I_();
               if (class04891 != null && this.M.add(class04891)) {
                  this.N.Nr().N(class00040.N(class04891, 1.0F, 1.0F));
               }

               return true;
            }
         });
      }

      this.M.clear();
      if (this.B != null) {
         this.B.u();
      }
   }

   private int N(int var1) {
      if (this.M() >= var1) {
         int ix = 0;

         for (int j = 0; j < 5; j++) {
            if (this.i.get(j)) {
               ix = 0;
            } else if (++ix == var1) {
               return j + 1 - ix;
            }
         }
      }

      return -1;
   }

   public void N(class04680 var1) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         this.R.add(var1);
      }
   }

   public double R() {
      return ((class05630)this.N.i_7).K().method_41753();
   }
}
