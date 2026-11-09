package minecraft;

import com.google.common.collect.ImmutableList;

public enum class05246 implements class05033 {
   field_16686("terrain_matching", ImmutableList.of(new class05239(class07830.field_13194, -1))),
   field_16687("rigid", ImmutableList.of());

   public static final class05031<class05246> field_24956 = class05033.N(class05246::values);
   private final String field_16682;
   private final ImmutableList<class01219> field_16685;

   private class05246(String var3, ImmutableList<class01219> var4) {
      this.field_16682 = var3;
      this.field_16685 = var4;
   }

   public ImmutableList<class01219> y() {
      return this.field_16685;
   }

   public static class05246 N(String var0) {
      return field_24956.N(var0);
   }

   public String N() {
      return this.field_16682;
   }

   @Override
   public String method_15434() {
      return this.field_16682;
   }
}
