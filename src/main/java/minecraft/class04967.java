package minecraft;

import com.google.gson.annotations.SerializedName;
import com.mojang.logging.LogUtils;
import java.util.List;
import org.slf4j.Logger;

public record class04967(List<class04981> servers) implements class04942 {
   private static final Logger y = LogUtils.getLogger();

   public class04967(List<class04981> servers) {
      super();
      this.servers = servers;
   }

   @SerializedName("servers")
   public List<class04981> N() {
      return this.servers;
   }

   public static class04967 N(class04968 var0, String var1) {
      try {
         class04967 class04967 = var0.N(var1, class04967.class);
         if (class04967 != null) {
            class04967.servers.forEach(class04981::N);
            return class04967;
         }

         y.error("Could not parse McoServerList: {}", var1);
      } catch (Exception exception) {
         y.error("Could not parse McoServerList", exception);
      }

      return new class04967(List.of());
   }
}
