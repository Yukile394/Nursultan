package minecraft;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class class06392 extends class04774 {
   private static final int B = 100;
   private final class01894 Z;
   private final Set<UUID> z = Sets.newHashSet();
   private int U;
   private int E = 100;

   public void L(class04770 var1) {
      if (this.z.contains(var1.method_5667())) {
         this.N(var1);
      }
   }

   public class06392(class01894 var1, class00392 var2) {
      super(var2, class06685.field_5786, class06702.field_5795);
      this.Z = var1;
      this.N(0.0F);
   }

   public class01894 Z() {
      return this.Z;
   }

   public class06425 m() {
      return new class06425(this.y(), this.P(), this.U(), this.E(), this.u(), this.i(), this.R(), this.M(), this.B(), Set.copyOf(this.z));
   }

   public int U() {
      return this.U;
   }

   @Override
   public void z() {
      super.z();
      this.z.clear();
   }

   public void u(class04770 var1) {
      super.y(var1);
   }

   public void y(int var1) {
      this.E = var1;
      this.N(class04995.N((float)this.U / var1, 0.0F, 1.0F));
   }

   @Override
   public void y(class04770 var1) {
      super.y(var1);
      this.z.remove(var1.method_5667());
   }

   public int E() {
      return this.E;
   }

   public static class06392 N(class01894 var0, class06425 var1) {
      class06392 class06392 = new class06392(var0, var1.N());
      class06392.u(var1.y());
      class06392.N(var1.L());
      class06392.y(var1.u());
      class06392.N(var1.i());
      class06392.N(var1.R());
      class06392.N(var1.M());
      class06392.y(var1.B());
      class06392.L(var1.Z());
      var1.z().forEach(class06392::N);
      return class06392;
   }

   @Override
   public void N(class04770 var1) {
      super.N(var1);
      this.z.add(var1.method_5667());
   }

   public void N(UUID var1) {
      this.z.add(var1);
   }

   public void N(int var1) {
      this.U = var1;
      this.N(class04995.N((float)var1 / this.E, 0.0F, 1.0F));
   }

   public boolean N(Collection<class04770> var1) {
      HashSet hashset = Sets.newHashSet();
      HashSet hashset1 = Sets.newHashSet();

      for (UUID uuid : this.z) {
         boolean var6 = false;

         for (class04770 class04770xxx : var1) {
            if (class04770xxx.method_5667().equals(uuid)) {
               var6 = true;
               break;
            }
         }

         if (!var6) {
            hashset.add(uuid);
         }
      }

      for (class04770 class04770x : var1) {
         boolean flag1 = false;

         for (UUID uuid2 : this.z) {
            if (class04770x.method_5667().equals(uuid2)) {
               flag1 = true;
               break;
            }
         }

         if (!flag1) {
            hashset1.add(class04770x);
         }
      }

      for (UUID uuid1 : hashset) {
         for (class04770 class04770x : this.s()) {
            if (class04770x.method_5667().equals(uuid1)) {
               this.y(class04770x);
               break;
            }
         }

         this.z.remove(uuid1);
      }

      for (class04770 class04770xx : hashset1) {
         this.N(class04770xx);
      }

      return !hashset.isEmpty() || !hashset1.isEmpty();
   }

   public final class00392 W() {
      return class00390.N(this.y()).N(var1 -> var1.N(this.u().N()).N(new class00401(class00392.y(this.Z().toString()))).N(this.Z().toString()));
   }
}
