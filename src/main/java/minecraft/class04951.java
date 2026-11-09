package minecraft;

import com.google.gson.annotations.SerializedName;
import org.jspecify.annotations.Nullable;

public record class04951(String name, String description) implements class04942 {
   public class04951(@Nullable String name, String description) {
      super();
      this.name = name;
      this.description = description;
   }

   @SerializedName("description")
   public String y() {
      return this.description;
   }

   @SerializedName("name")
   @Nullable
   public String N() {
      return this.name;
   }
}
