package minecraft;

import Nursultan.class10697;
import Nursultan.class10700;
import Nursultan.class10701;
import Nursultan.class10703;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class class06987 {
   private final class04782 N;
   private final List<class06968<?>> y = new ArrayList<>();
   private final Map<class00455<?>, class10701<?>> L = new HashMap<>();
   private final class06991 u = new class06991();
   private final class06965 i = new class06965();
   private boolean R = true;
   private Set<class00455<?>> M = Set.of();

   public void L(class07209 var1) {
      if (!this.R) {
         this.u.N(this.N, var1);
         this.i.N(this.N, var1);
      }
   }

   public class06987(class04782 var1) {
      super();
      this.N = var1;

      for (class00455<?> class00455 : class04206.R) {
         if (class00455.y() != null) {
            this.L.put(class00455, new class10701<>(class00455));
         }
      }

      this.y.addAll(this.L.values());
      this.y.add(this.u);
      this.y.add(this.i);
   }

   public void y(class07049 var1) {
      if (!this.R) {
         Iterator<class10701<?>> iterator = this.L.values().iterator();

         while (iterator.hasNext()) {
            iterator.next().N(var1);
         }
      }
   }

   public void y(class07209 var1) {
      if (!this.R) {
         this.u.y(this.N, var1);
      }
   }

   public boolean y(class00455<?> var1) {
      return this.M.contains(var1);
   }

   public <T> void y(class07209 var1, class00455<T> var2, T var3) {
      if (this.y(var2)) {
         this.N(new class07321(var1), var2, new class00474(var2.y(var3)));
      }
   }

   private void N(class07321 var1, class00455<?> var2, class00381<? super class07280> var3) {
      for (class04770 class04770 : this.N.method_14178().L.N(var1, false)) {
         if (class04770.method_74538().contains(var2)) {
            class04770.field_13987.method_14364(var3);
         }
      }
   }

   private void N(class07049 var1, class00455<?> var2, class00381<? super class07280> var3) {
      this.N.method_14178().L.N(var1, var3, var1x -> var1x.method_74538().contains(var2));
   }

   public <T> void N(class07049 var1, class00455<T> var2, T var3) {
      if (this.y(var2)) {
         this.N(var1, var2, new class00449(var1.method_5628(), var2.N(var3)));
      }
   }

   public <T> void N(class07209 var1, class00455<T> var2, T var3) {
      if (this.y(var2)) {
         this.N(new class07321(var1), var2, new class00437(var1, var2.N(var3)));
      }
   }

   public <T> void N(class07209 var1, class00455<T> var2) {
      if (this.y(var2)) {
         this.N(new class07321(var1), var2, new class00437(var1, var2.N()));
      }
   }

   public <T> void N(class07049 var1, class00455<T> var2) {
      if (this.y(var2)) {
         this.N(var1, var2, new class00449(var1.method_5628(), var2.N()));
      }
   }

   public void N(class00394 var1) {
      if (!this.R) {
         var1.method_74589(this.N, new class10700(this, var1));
      }
   }

   public void N(class07321 var1) {
      if (!this.R) {
         Iterator<class10701<?>> iterator = this.L.values().iterator();

         while (iterator.hasNext()) {
            iterator.next().N(var1);
         }
      }
   }

   public void N(class00570 var1) {
      if (!this.R) {
         var1.method_74589(this.N, new class10703(this, var1));
         var1.o().values().forEach(this::N);
      }
   }

   public <T> class10701<T> N(class00455<T> var1) {
      return (class10701<T>)this.L.get(var1);
   }

   private void N() {
      class06265 class06265 = this.N.method_14178().L;
      class06265.y(this::N);

      for (class07049 class07049 : this.N.method_27909()) {
         if (class06265.L(class07049)) {
            this.N(class07049);
         }
      }
   }

   public void N(class06954 var1) {
      this.M = var1.y();
      boolean flag = this.M.isEmpty();
      if (this.R != flag) {
         this.R = flag;
         if (flag) {
            for (class06968<?> class06968 : this.y) {
               class06968.N();
            }
         } else {
            this.N();
         }
      }

      if (!this.R) {
         for (class06968 class06968 : this.y) {
            class06968.N(this.N);
         }
      }
   }

   public void N(class05377 var1) {
      if (!this.R) {
         this.u.N(this.N, var1);
         this.i.N(this.N, var1);
      }
   }

   public void N(class04770 var1, class07049 var2) {
      if (!this.R) {
         Iterator<class06968<?>> iterator = this.y.iterator();

         while (iterator.hasNext()) {
            iterator.next().N(var1, var2);
         }
      }
   }

   public void N(class04770 var1, class07321 var2) {
      if (!this.R) {
         Iterator<class06968<?>> iterator = this.y.iterator();

         while (iterator.hasNext()) {
            iterator.next().N(var1, var2);
         }
      }
   }

   public void N(class07049 var1) {
      if (!this.R) {
         var1.method_74589(this.N, new class10697(this, var1));
      }
   }

   public void N(class07209 var1) {
      if (!this.R) {
         Iterator<class10701<?>> iterator = this.L.values().iterator();

         while (iterator.hasNext()) {
            iterator.next().N(this.N, var1);
         }
      }
   }
}
