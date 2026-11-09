package minecraft;

import java.util.Map;

public record class08204(Map<class08205, String> shaderSources, Map<class01894, class02414> postChains) {
   public static final class08204 L = new class08204(Map.of(), Map.of());

   public class08204(Map<class08205, String> shaderSources, Map<class01894, class02414> postChains) {
      this.shaderSources = shaderSources;
      this.postChains = postChains;
   }

   public Map<class01894, class02414> y() {
      return this.postChains;
   }

   public Map<class08205, String> N() {
      return this.shaderSources;
   }
}
