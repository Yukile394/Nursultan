package minecraft;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import java.util.Locale;

public enum class08743 {
   field_60923(class08394.d, 4194304, false),
   field_60925(class08394.Y, 4194304, false),
   field_60926(class08394.Q, 786432, true),
   field_60927(class08394.g, 1536, true);

   private final RenderPipeline field_60928;
   private final int field_60929;
   private final boolean field_60931;
   private final String field_60932;

   public String L() {
      return this.field_60932;
   }

   private class08743(RenderPipeline var3, int var4, boolean var5) {
      this.field_60928 = var3;
      this.field_60929 = var4;
      this.field_60931 = var5;
      this.field_60932 = this.toString().toLowerCase(Locale.ROOT);
   }

   public boolean u() {
      return this.field_60931;
   }

   public int y() {
      return this.field_60929;
   }

   public RenderPipeline N() {
      return this.field_60928;
   }
}
