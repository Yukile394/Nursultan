package minecraft;

import java.util.List;

public record class03379(List<class04981> serverList, List<class04981> availableSnapshotServers) {
   public class03379(List<class04981> serverList, List<class04981> availableSnapshotServers) {
      this.serverList = serverList;
      this.availableSnapshotServers = availableSnapshotServers;
   }

   public List<class04981> y() {
      return this.availableSnapshotServers;
   }

   public List<class04981> N() {
      return this.serverList;
   }
}
