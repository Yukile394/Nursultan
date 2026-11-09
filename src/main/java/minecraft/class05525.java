package minecraft;

enum class05525 {
   field_2678(
      new class05490(
         class01894.y("advancements/tab_above_left_selected"),
         class01894.y("advancements/tab_above_middle_selected"),
         class01894.y("advancements/tab_above_right_selected")
      ),
      new class05490(class01894.y("advancements/tab_above_left"), class01894.y("advancements/tab_above_middle"), class01894.y("advancements/tab_above_right")),
      28,
      32,
      8
   ),
   field_2673(
      new class05490(
         class01894.y("advancements/tab_below_left_selected"),
         class01894.y("advancements/tab_below_middle_selected"),
         class01894.y("advancements/tab_below_right_selected")
      ),
      new class05490(class01894.y("advancements/tab_below_left"), class01894.y("advancements/tab_below_middle"), class01894.y("advancements/tab_below_right")),
      28,
      32,
      8
   ),
   field_2675(
      new class05490(
         class01894.y("advancements/tab_left_top_selected"),
         class01894.y("advancements/tab_left_middle_selected"),
         class01894.y("advancements/tab_left_bottom_selected")
      ),
      new class05490(class01894.y("advancements/tab_left_top"), class01894.y("advancements/tab_left_middle"), class01894.y("advancements/tab_left_bottom")),
      32,
      28,
      5
   ),
   field_2677(
      new class05490(
         class01894.y("advancements/tab_right_top_selected"),
         class01894.y("advancements/tab_right_middle_selected"),
         class01894.y("advancements/tab_right_bottom_selected")
      ),
      new class05490(class01894.y("advancements/tab_right_top"), class01894.y("advancements/tab_right_middle"), class01894.y("advancements/tab_right_bottom")),
      32,
      28,
      5
   );

   private final class05490 field_45423;
   private final class05490 field_45424;
   private final int field_2671;
   private final int field_2670;
   private final int field_2669;

   public int L() {
      return this.field_2669;
   }

   private class05525(class05490 var3, class05490 var4, int var5, int var6, int var7) {
      this.field_45423 = var3;
      this.field_45424 = var4;
      this.field_2671 = var5;
      this.field_2670 = var6;
      this.field_2669 = var7;
   }

   public int y(int var1) {
      switch (this) {
         case field_2678:
            return -this.field_2670 + 4;
         case field_2673:
            return 136;
         case field_2675:
            return this.field_2670 * var1;
         case field_2677:
            return this.field_2670 * var1;
         default:
            throw new UnsupportedOperationException("Don't know what this tab type is!" + this);
      }
   }

   public int y() {
      return this.field_2670;
   }

   public boolean N(int var1, int var2, int var3, double var4, double var6) {
      int i = var1 + this.N(var3);
      int j = var2 + this.y(var3);
      return var4 > i && var4 < i + this.field_2671 && var6 > j && var6 < j + this.field_2670;
   }

   public void N(class01054 var1, int var2, int var3, boolean var4, int var5) {
      class05490 class05490 = var4 ? this.field_45423 : this.field_45424;
      class01894 class01894;
      if (var5 == 0) {
         class01894 = class05490.N();
      } else if (var5 == this.field_2669 - 1) {
         class01894 = class05490.L();
      } else {
         class01894 = class05490.y();
      }

      var1.N(class08394.Na, class01894, var2, var3, this.field_2671, this.field_2670);
   }

   public int N(int var1) {
      switch (this) {
         case field_2678:
            return (this.field_2671 + 4) * var1;
         case field_2673:
            return (this.field_2671 + 4) * var1;
         case field_2675:
            return -this.field_2671 + 4;
         case field_2677:
            return 248;
         default:
            throw new UnsupportedOperationException("Don't know what this tab type is!" + this);
      }
   }

   public void N(class01054 var1, int var2, int var3, int var4, class06584 var5) {
      int i = var2 + this.N(var4);
      int j = var3 + this.y(var4);
      switch (this) {
         case field_2678:
            i += 6;
            j += 9;
            break;
         case field_2673:
            i += 6;
            j += 6;
            break;
         case field_2675:
            i += 10;
            j += 5;
            break;
         case field_2677:
            i += 6;
            j += 5;
      }

      var1.y(var5, i, j);
   }

   public int N() {
      return this.field_2671;
   }
}
