package minecraft;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

public class class06455 {
   private static final int y = 182;
   private static final int L = 5;
   private static final class01894[] u = new class01894[]{
      class01894.y("boss_bar/pink_background"),
      class01894.y("boss_bar/blue_background"),
      class01894.y("boss_bar/red_background"),
      class01894.y("boss_bar/green_background"),
      class01894.y("boss_bar/yellow_background"),
      class01894.y("boss_bar/purple_background"),
      class01894.y("boss_bar/white_background")
   };
   private static final class01894[] i = new class01894[]{
      class01894.y("boss_bar/pink_progress"),
      class01894.y("boss_bar/blue_progress"),
      class01894.y("boss_bar/red_progress"),
      class01894.y("boss_bar/green_progress"),
      class01894.y("boss_bar/yellow_progress"),
      class01894.y("boss_bar/purple_progress"),
      class01894.y("boss_bar/white_progress")
   };
   private static final class01894[] R = new class01894[]{
      class01894.y("boss_bar/notched_6_background"),
      class01894.y("boss_bar/notched_10_background"),
      class01894.y("boss_bar/notched_12_background"),
      class01894.y("boss_bar/notched_20_background")
   };
   private static final class01894[] M = new class01894[]{
      class01894.y("boss_bar/notched_6_progress"),
      class01894.y("boss_bar/notched_10_progress"),
      class01894.y("boss_bar/notched_12_progress"),
      class01894.y("boss_bar/notched_20_progress")
   };
   private final class06202 B;
   final Map<UUID, class01206> N = Maps.newLinkedHashMap();

   public boolean L() {
      if (!this.N.isEmpty()) {
         Iterator<class01206> iterator = this.N.values().iterator();

         while (iterator.hasNext()) {
            if (iterator.next().R()) {
               return true;
            }
         }
      }

      return false;
   }

   public class06455(class06202 var1) {
      super();
      this.B = var1;
   }

   public boolean u() {
      if (!this.N.isEmpty()) {
         Iterator<class01206> iterator = this.N.values().iterator();

         while (iterator.hasNext()) {
            if (iterator.next().B()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean y() {
      if (!this.N.isEmpty()) {
         Iterator<class01206> iterator = this.N.values().iterator();

         while (iterator.hasNext()) {
            if (iterator.next().M()) {
               return true;
            }
         }
      }

      return false;
   }

   public void N() {
      this.N.clear();
   }

   public void N(class01054 var1) {
      if (!this.N.isEmpty()) {
         var1.L();
         class04643 class04643 = class08700.N();
         class04643.N("bossHealth");
         int ix = var1.N();
         int j = 12;

         for (class01206 class01206 : this.N.values()) {
            int k = ix / 2 - 91;
            this.N(var1, k, j, class01206);
            class00392 class00392 = class01206.y();
            int l = ((class01590)this.B.i_3).N(class00392);
            int i1 = ix / 2 - l / 2;
            int j1 = j - 9;
            var1.y((class01590)this.B.i_3, class00392, i1, j1, -1);
            j += 10 + 9;
            if (j >= var1.y() / 3) {
               break;
            }
         }

         class04643.L();
      }
   }

   private void N(class01054 var1, int var2, int var3, class06687 var4, int var5, class01894[] var6, class01894[] var7) {
      var1.N(class08394.Na, var6[var4.u().ordinal()], 182, 5, 0, 0, var2, var3, var5, 5);
      if (var4.i() != class06702.field_5795) {
         var1.N(class08394.Na, var7[var4.i().ordinal() - 1], 182, 5, 0, 0, var2, var3, var5, 5);
      }
   }

   private void N(class01054 var1, int var2, int var3, class06687 var4) {
      this.N(var1, var2, var3, var4, 182, u, R);
      int ix = class04995.y(var4.L(), 0, 182);
      if (ix > 0) {
         this.N(var1, var2, var3, var4, ix, i, M);
      }
   }

   public void N(class07254 var1) {
      var1.N(new class06481(this));
   }
}
