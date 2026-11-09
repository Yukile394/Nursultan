package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;

public class class01314 {
   private final List<class01894> N;

   private class01314(List<class01894> var1) {
      super();
      this.N = var1;
   }

   public static class01314 N(JsonObject var0) {
      JsonArray jsonarray = class05001.N(var0, "textures", null);
      if (jsonarray == null) {
         return new class01314(List.of());
      } else {
         List list = Streams.stream(jsonarray).map(var0x -> class05001.N(var0x, "texture")).map(class01894::N).collect(ImmutableList.toImmutableList());
         return new class01314(list);
      }
   }

   public List<class01894> N() {
      return this.N;
   }
}
