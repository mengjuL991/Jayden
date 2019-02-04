import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Node> nodes = new ArrayList<>();

    public static void setup() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("Tree.txt"));
        while(scan.hasNextLine()){
            String[] temp = scan.nextLine().split(" ");
            int id = Integer.parseInt(temp[0]);
            int left = Integer.parseInt(temp[1]);
            int right = Integer.parseInt(temp[2]);
            nodes.add(new Node(id,left,right));
        }
    }

    public static void printLeafs(Node node) {
        if ((node.left == 0) && (node.right == 0)) {
            System.out.println(node.id);
        }

            int leftNodeId = node.left;
            int leftNodeIndex = 0;
            for (int i = 0; i < nodes.size(); i++) {
                if (nodes.get(i).id == leftNodeId) {
//                    System.out.println("The index of " + leftNodeId + " is at " + i);
                    leftNodeIndex = i;
                }
            }
            int rightNodeId = node.right;
            int rightNodeIndex = 0;
            for (int i = 0; i < nodes.size(); i++) {
                if (nodes.get(i).id == rightNodeId) {
//                    System.out.println("The index of " + rightNodeId + " is at " + i);
                    rightNodeIndex = i;
                }
            }
            if (leftNodeId != 0) {
                printLeafs(nodes.get(leftNodeIndex));
            }
            if (rightNodeId != 0) {
                printLeafs(nodes.get(rightNodeIndex));
            }


        //  printLeafs(leftNode);
    }

    public static void main(String[] args) throws FileNotFoundException {
        setup();

        printLeafs(nodes.get(0));
//       System.out.println(nodes.get(0).right);
//       int idOfRightNode = nodes.get(0).right;
//
//
//
//       printLeafs(nodes.get(0).right);
    }
}
