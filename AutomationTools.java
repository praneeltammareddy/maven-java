import java.util.LinkedList;
  public class AutomationTools {
  public static void main(String[] args) {
     // create an empty linked list
     LinkedList<String> l_list = new LinkedList<String>();
   // use add() method to add values in the linked list
          l_list.add("Git& GitHub");
          l_list.add("Jenkins");
          l_list.add("Chef/Ansible");
          l_list.add("Docker");
          l_list.add("Vagrant");
          l_list.add("Nagios");
          l_list.add("Kubernetes");
          l_list.add("Terraform");
	
   // print the list
   System.out.println("The Automated Tools in DevOps are : " + l_list);
   }
}