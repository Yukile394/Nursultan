package minecraft;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public record class03814(Map<UUID, Path> downloaded, Set<UUID> failed) {

   public class03814() {
      this(new HashMap<>(), new HashSet<>());
   }

   public class03814(Map<UUID, Path> downloaded, Set<UUID> failed) {
      this.downloaded = downloaded;
      this.failed = failed;
   }

   public Set<UUID> y() {
      return this.failed;
   }

   public Map<UUID, Path> N() {
      return this.downloaded;
   }
}
