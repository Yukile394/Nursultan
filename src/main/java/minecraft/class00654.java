package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;

public enum class00654 implements class05033 {
   field_11749("open_url", true, class00652.y),
   field_11746("open_file", false, class00623.y),
   field_11750("run_command", true, class00625.y),
   field_11745("suggest_command", true, class00640.y),
   field_60821("show_dialog", true, class00626.y),
   field_11748("change_page", true, class00661.y),
   field_21462("copy_to_clipboard", true, class00627.y),
   field_60822("custom", true, class00669.y);

   public static final Codec<class00654> field_46595 = class05033.N(class00654::values);
   public static final Codec<class00654> field_46596 = field_46595.validate(class00654::N);
   private final boolean field_11744;
   private final String field_11742;
   final MapCodec<? extends class00647> field_55902;

   private class00654(String var3, boolean var4, MapCodec<? extends class00647> var5) {
      this.field_11742 = var3;
      this.field_11744 = var4;
      this.field_55902 = var5;
   }

   public MapCodec<? extends class00647> y() {
      return this.field_55902;
   }

   public static DataResult<class00654> N(class00654 var0) {
      return !var0.N() ? DataResult.error(() -> "Click event type not allowed: " + var0) : DataResult.success(var0, Lifecycle.stable());
   }

   public boolean N() {
      return this.field_11744;
   }

   @Override
   public String method_15434() {
      return this.field_11742;
   }
}
