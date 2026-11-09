package minecraft;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;

public class class04774 extends class06687 {
   private final Set<class04770> B = Sets.newHashSet();
   private final Set<class04770> Z = Collections.unmodifiableSet(this.B);
   private boolean z = true;

   @Override
   public class06687 L(boolean var1) {
      if (var1 != this.M) {
         super.L(var1);
         this.N(class07254::i);
      }

      return this;
   }

   public boolean P() {
      return this.z;
   }

   public class04774(class00392 var1, class06685 var2, class06702 var3) {
      super(class04995.N(), var1, var2, var3);
   }

   public Collection<class04770> s() {
      return this.Z;
   }

   public void z() {
      if (!this.B.isEmpty()) {
         for (class04770 class04770 : Lists.newArrayList(this.B)) {
            this.y(class04770);
         }
      }
   }

   public void u(boolean var1) {
      if (var1 != this.z) {
         this.z = var1;
         Iterator<class04770> iterator = this.B.iterator();

         while (iterator.hasNext()) {
            iterator.next().field_13987.method_14364(var1 ? class07254.N(this) : class07254.N(this.N()));
         }
      }
   }

   @Override
   public class06687 y(boolean var1) {
      if (var1 != this.R) {
         super.y(var1);
         this.N(class07254::i);
      }

      return this;
   }

   public void y(class04770 var1) {
      if (this.B.remove(var1) && this.z) {
         var1.field_13987.method_14364(class07254.N(this.N()));
      }
   }

   @Override
   public void N(class00392 var1) {
      if (!Objects.equal(var1, this.N)) {
         super.N(var1);
         this.N(class07254::L);
      }
   }

   @Override
   public void N(float var1) {
      if (var1 != this.y) {
         super.N(var1);
         this.N(class07254::y);
      }
   }

   @Override
   public class06687 N(boolean var1) {
      if (var1 != this.i) {
         super.N(var1);
         this.N(class07254::i);
      }

      return this;
   }

   @Override
   public void N(class06702 var1) {
      if (var1 != this.u) {
         super.N(var1);
         this.N(class07254::u);
      }
   }

   @Override
   public void N(class06685 var1) {
      if (var1 != this.L) {
         super.N(var1);
         this.N(class07254::u);
      }
   }

   private void N(Function<class06687, class07254> var1) {
      if (this.z) {
         class07254 class07254 = (class07254)var1.apply(this);
         Iterator<class04770> iterator = this.B.iterator();

         while (iterator.hasNext()) {
            iterator.next().field_13987.method_14364(class07254);
         }
      }
   }

   public void N(class04770 var1) {
      if (this.B.add(var1) && this.z) {
         var1.field_13987.method_14364(class07254.N(this));
      }
   }
}
