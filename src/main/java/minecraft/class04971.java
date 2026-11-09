package minecraft;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public record class04971(List<class04970> pingResults, List<Long> realmIds) implements class04942 {
   public class04971(List<class04970> pingResults, List<Long> realmIds) {
      this.pingResults = pingResults;
      this.realmIds = realmIds;
   }

   @SerializedName("worldIds")
   public List<Long> y() {
      return this.realmIds;
   }

   @SerializedName("pingResults")
   public List<class04970> N() {
      return this.pingResults;
   }
}
