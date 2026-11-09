package minecraft;

import com.google.common.hash.HashCode;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public class class03837 {
   private final class03813 L;
   final class03802 N;
   private final class03820 u;
   private final Runnable i;
   private class03826 R;
   final List<class03845> y = new ArrayList<>();

   @Nullable
   private class03845 L(UUID var1) {
      for (class03845 class03845 : this.y) {
         if (!class03845.N() && class03845.N.equals(var1)) {
            return class03845;
         }
      }

      return null;
   }

   public void L() {
      this.R = class03826.field_47648;

      for (class03845 class03845 : this.y) {
         if (!class03845.B && !class03845.N()) {
            this.N(class03845);
         }
      }

      this.N();
   }

   private void M() {
      this.y.removeIf(var1 -> {
         if (var1.M != class03843.field_47639) {
            return false;
         } else if (var1.i != null) {
            class03824 class03824 = var1.i.field_47657;
            if (class03824 != null) {
               this.N.N(var1.N, class03824);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   public class03837(class03813 var1, class03802 var2, class03820 var3, Runnable var4, class03826 var5) {
      super();
      this.L = var1;
      this.N = var2;
      this.u = var3;
      this.i = var4;
      this.R = var5;
   }

   private boolean B() {
      ArrayList arraylist = new ArrayList();
      boolean flag = false;

      for (class03845 class03845x : this.y) {
         if (!class03845x.N() && class03845x.B) {
            if (class03845x.R != class03819.field_47645) {
               flag = true;
            }

            if (class03845x.R == class03819.field_47643) {
               class03845x.R = class03819.field_47644;
               arraylist.add(class03845x);
            }
         }
      }

      if (!arraylist.isEmpty()) {
         HashMap hashmap = new HashMap();

         for (class03845 class03845x : arraylist) {
            hashmap.put(class03845x.N, new class03848(class03845x.y, class03845x.L));
         }

         this.L.N(hashmap, var2x -> this.N(arraylist, var2x));
      }

      return flag;
   }

   private void Z() {
      boolean flag = false;
      ArrayList arraylist = new ArrayList();
      ArrayList arraylist1 = new ArrayList();

      for (class03845 class03845xx : this.y) {
         if (class03845xx.M == class03843.field_47640) {
            return;
         }

         boolean flag1 = class03845xx.B && class03845xx.R == class03819.field_47645 && !class03845xx.N();
         if (flag1 && class03845xx.M == class03843.field_47639) {
            arraylist.add(class03845xx);
            flag = true;
         }

         if (class03845xx.M == class03843.field_47641) {
            if (!flag1) {
               flag = true;
               arraylist1.add(class03845xx);
            } else {
               arraylist.add(class03845xx);
            }
         }
      }

      if (flag) {
         for (class03845 class03845x : arraylist) {
            if (class03845x.M != class03843.field_47641) {
               class03845x.M = class03843.field_47640;
            }
         }

         for (class03845 class03845x : arraylist1) {
            class03845x.M = class03843.field_47640;
         }

         this.u.scheduleReload(new class03816(this, arraylist, arraylist1));
      }
   }

   public void i() {
      this.R = class03826.field_47647;
   }

   public void u() {
      this.R = class03826.field_47649;

      for (class03845 class03845 : this.y) {
         if (!class03845.B) {
            class03845.N(class03834.field_47653);
         }
      }

      this.N();
   }

   private void y(UUID var1) {
      for (class03845 class03845 : this.y) {
         if (class03845.N.equals(var1)) {
            class03845.N(class03834.field_47656);
         }
      }
   }

   public void y() {
      Iterator<class03845> iterator = this.y.iterator();

      while (iterator.hasNext()) {
         iterator.next().N(class03834.field_47655);
      }

      this.N();
   }

   private void N(UUID var1, class03845 var2) {
      this.y(var1);
      this.y.add(var2);
      if (this.R == class03826.field_47648) {
         this.N(var2);
      }

      this.N();
   }

   private void N(class03845 var1) {
      this.N.N(var1.N, class03849.field_47699);
      var1.B = true;
   }

   private void N(Collection<class03845> var1, class03814 var2) {
      if (!var2.y().isEmpty()) {
         for (class03845 class03845x : this.y) {
            if (class03845x.M != class03843.field_47641) {
               if (var2.y().contains(class03845x.N)) {
                  class03845x.N(class03834.field_47651);
               } else {
                  class03845x.N(class03834.field_47654);
               }
            }
         }
      }

      for (class03845 class03845x : var1) {
         Path path = var2.N().get(class03845x.N);
         if (path != null) {
            class03845x.R = class03819.field_47645;
            class03845x.u = path;
            if (!class03845x.N()) {
               this.N.N(class03845x.N, class03849.field_47700);
            }
         }
      }

      this.N();
   }

   public void N(UUID var1, Path var2) {
      if (this.R == class03826.field_47649) {
         this.N.N(var1, class03824.field_47623);
      } else {
         URL url;
         try {
            url = var2.toUri().toURL();
         } catch (MalformedURLException malformedurlexception) {
            throw new IllegalStateException("Can't convert path to URL " + var2, malformedurlexception);
         }

         class03845 class03845 = new class03845(var1, url, null);
         class03845.R = class03819.field_47645;
         class03845.u = var2;
         this.N(var1, class03845);
      }
   }

   public void N(UUID var1) {
      class03845 class03845 = this.L(var1);
      if (class03845 != null) {
         class03845.N(class03834.field_47655);
         this.N();
      }
   }

   public void N(UUID var1, URL var2, @Nullable HashCode var3) {
      if (this.R == class03826.field_47649) {
         this.N.N(var1, class03824.field_47623);
      } else {
         this.N(var1, new class03845(var1, var2, var3));
      }
   }

   void N() {
      this.i.run();
   }

   public void R() {
      if (!this.B()) {
         this.Z();
      }

      this.M();
   }
}
