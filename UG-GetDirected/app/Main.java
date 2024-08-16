// package app;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.RoundRectangle2D;
// import Locations from /app/Locations.java;

public class Main {
    public static map graph = new map();

    private static class RoundedBorder implements Border {

        private int radius;

        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius + 1, this.radius + 1, this.radius + 2, this.radius);
        }

        @Override
        public boolean isBorderOpaque() {
            return true;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
        }
    }

    public static void main(String[] args) {

        // creating an instances of the graph class...
        Locations mainGate = new Locations("Main Gate");
        Locations UGFireService = new Locations("UG Fire Service");
        Locations greatHall = new Locations("Great Hall");
        Locations nb = new Locations("N Block");
        Locations jqb = new Locations("JQB");
        Locations pentHall = new Locations("Pentagon Hall");
        Locations balmeLibrary = new Locations("Balme Library");
        Locations nnb = new Locations("NNB");
        Locations ugcs = new Locations("UGCS");
        Locations CSDepartment = new Locations("CS Department");
        Locations athleticOval = new Locations("Athletic Oval");
        Locations voltaHall = new Locations("Volta Hall");
        Locations akuafoHall = new Locations("Akuafo Hall");
        Locations legonHall = new Locations("Legon Hall");
        Locations nightMarket = new Locations("Night Market");
        Locations diasporaHalls = new Locations("Diaspora");

        // Adding the nodes to the graph
        graph.addVertex(balmeLibrary);
        graph.addVertex(nnb);
        graph.addVertex(ugcs);
        graph.addVertex(mainGate);
        graph.addVertex(greatHall);
        graph.addVertex(nb);
        graph.addVertex(UGFireService);
        graph.addVertex(jqb);
        graph.addVertex(pentHall);
        graph.addVertex(CSDepartment);
        graph.addVertex(athleticOval);
        graph.addVertex(voltaHall);
        graph.addVertex(akuafoHall);
        graph.addVertex(legonHall);
        graph.addVertex(nightMarket);
        graph.addVertex(diasporaHalls);

        // adding the edges and getting the distances between vertices
        graph.addEdge(new extent(mainGate, greatHall, 2000));
        graph.addEdge(new extent(mainGate, nb, 1100));
        graph.addEdge(new extent(mainGate, balmeLibrary, 800));
        graph.addEdge(new extent(mainGate, jqb, 300));
        graph.addEdge(new extent(mainGate, pentHall, 950));
        graph.addEdge(new extent(mainGate, nnb, 1300));
        graph.addEdge(new extent(mainGate, ugcs, 950));
        graph.addEdge(new extent(mainGate, CSDepartment, 900));
        graph.addEdge(new extent(mainGate, athleticOval, 950));
        graph.addEdge(new extent(mainGate, UGFireService, 300));
        graph.addEdge(new extent(mainGate, voltaHall, 950));
        graph.addEdge(new extent(mainGate, akuafoHall, 900));
        graph.addEdge(new extent(mainGate, legonHall, 1100));
        graph.addEdge(new extent(mainGate, nightMarket, 1200));
        graph.addEdge(new extent(mainGate, diasporaHalls, 1650));

        graph.addEdge(new extent(UGFireService, balmeLibrary, 950));
        graph.addEdge(new extent(UGFireService, mainGate, 300));
        graph.addEdge(new extent(UGFireService, nb, 1400));
        graph.addEdge(new extent(UGFireService, athleticOval, 1100));
        graph.addEdge(new extent(UGFireService, voltaHall, 1200));
        graph.addEdge(new extent(UGFireService, akuafoHall, 1100));
        graph.addEdge(new extent(UGFireService, legonHall, 1190));
        graph.addEdge(new extent(UGFireService, nightMarket, 1000));
        graph.addEdge(new extent(UGFireService, diasporaHalls, 1650));
        graph.addEdge(new extent(UGFireService, CSDepartment, 1100));
        graph.addEdge(new extent(UGFireService, greatHall, 2300));
        graph.addEdge(new extent(UGFireService, ugcs, 1100));
        graph.addEdge(new extent(UGFireService, pentHall, 1100));
        graph.addEdge(new extent(UGFireService, nnb, 1500));
        graph.addEdge(new extent(UGFireService, jqb, 500));

        graph.addEdge(new extent(greatHall, balmeLibrary, 1700));
        graph.addEdge(new extent(greatHall, mainGate, 2000));
        graph.addEdge(new extent(greatHall, nb, 1600));
        graph.addEdge(new extent(greatHall, athleticOval, 1200));
        graph.addEdge(new extent(greatHall, voltaHall, 1200));
        graph.addEdge(new extent(greatHall, akuafoHall, 1700));
        graph.addEdge(new extent(greatHall, legonHall, 1300));
        graph.addEdge(new extent(greatHall, nightMarket, 2200));
        graph.addEdge(new extent(greatHall, diasporaHalls, 3000));
        graph.addEdge(new extent(greatHall, UGFireService, 2300));
        graph.addEdge(new extent(greatHall, CSDepartment, 2000));
        graph.addEdge(new extent(greatHall, ugcs, 15000));
        graph.addEdge(new extent(greatHall, pentHall, 2500));
        graph.addEdge(new extent(greatHall, nnb, 1700));
        graph.addEdge(new extent(greatHall, jqb, 2100));

        graph.addEdge(new extent(nnb, balmeLibrary, 1000));
        graph.addEdge(new extent(nnb, mainGate, 1300));
        graph.addEdge(new extent(nnb, nb, 400));
        graph.addEdge(new extent(nnb, athleticOval, 1400));
        graph.addEdge(new extent(nnb, voltaHall, 550));
        graph.addEdge(new extent(nnb, akuafoHall, 1300));
        graph.addEdge(new extent(nnb, legonHall, 750));
        graph.addEdge(new extent(nnb, nightMarket, 1900));
        graph.addEdge(new extent(nnb, diasporaHalls, 2500));
        graph.addEdge(new extent(nnb, UGFireService, 1500));
        graph.addEdge(new extent(nnb, greatHall, 1700));
        graph.addEdge(new extent(nnb, ugcs, 650));
        graph.addEdge(new extent(nnb, pentHall, 1300));
        graph.addEdge(new extent(nnb, CSDepartment, 650));
        graph.addEdge(new extent(nnb, jqb, 1000));

        graph.addEdge(new extent(jqb, balmeLibrary, 850));
        graph.addEdge(new extent(jqb, mainGate, 300));
        graph.addEdge(new extent(jqb, nb, 750));
        graph.addEdge(new extent(jqb, athleticOval, 1200));
        graph.addEdge(new extent(jqb, voltaHall, 1100));
        graph.addEdge(new extent(jqb, akuafoHall, 1000));
        graph.addEdge(new extent(jqb, legonHall, 1100));
        graph.addEdge(new extent(jqb, nightMarket, 1600));
        graph.addEdge(new extent(jqb, diasporaHalls, 2200));
        graph.addEdge(new extent(jqb, UGFireService, 500));
        graph.addEdge(new extent(jqb, greatHall, 2100));
        graph.addEdge(new extent(jqb, ugcs, 850));
        graph.addEdge(new extent(jqb, pentHall, 650));
        graph.addEdge(new extent(jqb, nnb, 1000));
        graph.addEdge(new extent(jqb, CSDepartment, 550));

        graph.addEdge(new extent(ugcs, balmeLibrary, 200));
        graph.addEdge(new extent(ugcs, mainGate, 950));
        graph.addEdge(new extent(ugcs, nb, 650));
        graph.addEdge(new extent(ugcs, athleticOval, 650));
        graph.addEdge(new extent(ugcs, voltaHall, 400));
        graph.addEdge(new extent(ugcs, akuafoHall, 450));
        graph.addEdge(new extent(ugcs, legonHall, 400));
        graph.addEdge(new extent(ugcs, nightMarket, 1700));
        graph.addEdge(new extent(ugcs, diasporaHalls, 2400));
        graph.addEdge(new extent(ugcs, UGFireService, 1100));
        graph.addEdge(new extent(ugcs, greatHall, 1500));
        graph.addEdge(new extent(ugcs, CSDepartment, 700));
        graph.addEdge(new extent(ugcs, pentHall, 1200));
        graph.addEdge(new extent(ugcs, nnb, 650));
        graph.addEdge(new extent(ugcs, jqb, 850));

        graph.addEdge(new extent(CSDepartment, balmeLibrary, 850));
        graph.addEdge(new extent(CSDepartment, mainGate, 900));
        graph.addEdge(new extent(CSDepartment, nb, 450));
        graph.addEdge(new extent(CSDepartment, athleticOval, 1200));
        graph.addEdge(new extent(CSDepartment, voltaHall, 900));
        graph.addEdge(new extent(CSDepartment, akuafoHall, 1000));
        graph.addEdge(new extent(CSDepartment, legonHall, 1100));
        graph.addEdge(new extent(CSDepartment, nightMarket, 1900));
        graph.addEdge(new extent(CSDepartment, diasporaHalls, 2600));
        graph.addEdge(new extent(CSDepartment, UGFireService, 1100));
        graph.addEdge(new extent(CSDepartment, greatHall, 1900));
        graph.addEdge(new extent(CSDepartment, ugcs, 750));
        graph.addEdge(new extent(CSDepartment, pentHall, 550));
        graph.addEdge(new extent(CSDepartment, nnb, 650));
        graph.addEdge(new extent(CSDepartment, jqb, 550));

        graph.addEdge(new extent(balmeLibrary, CSDepartment, 850));
        graph.addEdge(new extent(balmeLibrary, mainGate, 800));
        graph.addEdge(new extent(balmeLibrary, nb, 800));
        graph.addEdge(new extent(balmeLibrary, athleticOval, 600));
        graph.addEdge(new extent(balmeLibrary, voltaHall, 400));
        graph.addEdge(new extent(balmeLibrary, akuafoHall, 270));
        graph.addEdge(new extent(balmeLibrary, legonHall, 450));
        graph.addEdge(new extent(balmeLibrary, nightMarket, 1400));
        graph.addEdge(new extent(balmeLibrary, diasporaHalls, 2700));
        graph.addEdge(new extent(balmeLibrary, UGFireService, 950));
        graph.addEdge(new extent(balmeLibrary, greatHall, 1700));
        graph.addEdge(new extent(balmeLibrary, ugcs, 200));
        graph.addEdge(new extent(balmeLibrary, pentHall, 1200));
        graph.addEdge(new extent(balmeLibrary, nnb, 850));
        graph.addEdge(new extent(balmeLibrary, jqb, 850));

        graph.addEdge(new extent(nb, balmeLibrary, 800));
        graph.addEdge(new extent(nb, mainGate, 1100));
        graph.addEdge(new extent(nb, CSDepartment, 450));
        graph.addEdge(new extent(nb, athleticOval, 1200));
        graph.addEdge(new extent(nb, voltaHall, 550));
        graph.addEdge(new extent(nb, akuafoHall, 1100));
        graph.addEdge(new extent(nb, legonHall, 750));
        graph.addEdge(new extent(nb, nightMarket, 1600));
        graph.addEdge(new extent(nb, diasporaHalls, 2300));
        graph.addEdge(new extent(nb, UGFireService, 1300));
        graph.addEdge(new extent(nb, greatHall, 1500));
        graph.addEdge(new extent(nb, ugcs, 650));
        graph.addEdge(new extent(nb, pentHall, 1100));
        graph.addEdge(new extent(nb, nnb, 450));
        graph.addEdge(new extent(nb, jqb, 750));

        graph.addEdge(new extent(athleticOval, balmeLibrary, 600));
        graph.addEdge(new extent(athleticOval, mainGate, 950));
        graph.addEdge(new extent(athleticOval, nb, 1200));
        graph.addEdge(new extent(athleticOval, CSDepartment, 1200));
        graph.addEdge(new extent(athleticOval, voltaHall, 550));
        graph.addEdge(new extent(athleticOval, akuafoHall, 500));
        graph.addEdge(new extent(athleticOval, legonHall, 500));
        graph.addEdge(new extent(athleticOval, nightMarket, 1000));
        graph.addEdge(new extent(athleticOval, diasporaHalls, 1800));
        graph.addEdge(new extent(athleticOval, UGFireService, 1200));
        graph.addEdge(new extent(athleticOval, greatHall, 1200));
        graph.addEdge(new extent(athleticOval, ugcs, 650));
        graph.addEdge(new extent(athleticOval, pentHall, 1750));
        graph.addEdge(new extent(athleticOval, nnb, 1100));
        graph.addEdge(new extent(athleticOval, jqb, 1200));

        graph.addEdge(new extent(voltaHall, balmeLibrary, 480));
        graph.addEdge(new extent(voltaHall, mainGate, 1400));
        graph.addEdge(new extent(voltaHall, nb, 550));
        graph.addEdge(new extent(voltaHall, athleticOval, 450));
        graph.addEdge(new extent(voltaHall, CSDepartment, 900));
        graph.addEdge(new extent(voltaHall, akuafoHall, 1400));
        graph.addEdge(new extent(voltaHall, legonHall, 150));
        graph.addEdge(new extent(voltaHall, nightMarket, 1400));
        graph.addEdge(new extent(voltaHall, diasporaHalls, 2300));
        graph.addEdge(new extent(voltaHall, UGFireService, 1500));
        graph.addEdge(new extent(voltaHall, greatHall, 1200));
        graph.addEdge(new extent(voltaHall, ugcs, 450));
        graph.addEdge(new extent(voltaHall, pentHall, 1400));
        graph.addEdge(new extent(voltaHall, nnb, 550));
        graph.addEdge(new extent(voltaHall, jqb, 1000));

        graph.addEdge(new extent(akuafoHall, balmeLibrary, 450));
        graph.addEdge(new extent(akuafoHall, mainGate, 500));
        graph.addEdge(new extent(akuafoHall, nb, 750));
        graph.addEdge(new extent(akuafoHall, athleticOval, 600));
        graph.addEdge(new extent(akuafoHall, voltaHall, 600));
        graph.addEdge(new extent(akuafoHall, CSDepartment, 1000));
        graph.addEdge(new extent(akuafoHall, legonHall, 700));
        graph.addEdge(new extent(akuafoHall, nightMarket, 1000));
        graph.addEdge(new extent(akuafoHall, diasporaHalls, 1700));
        graph.addEdge(new extent(akuafoHall, UGFireService, 650));
        graph.addEdge(new extent(akuafoHall, greatHall, 1700));
        graph.addEdge(new extent(akuafoHall, ugcs, 600));
        graph.addEdge(new extent(akuafoHall, pentHall, 1200));
        graph.addEdge(new extent(akuafoHall, nnb, 950));
        graph.addEdge(new extent(akuafoHall, jqb, 700));

        graph.addEdge(new extent(legonHall, balmeLibrary, 280));
        graph.addEdge(new extent(legonHall, mainGate, 1600));
        graph.addEdge(new extent(legonHall, nb, 800));
        graph.addEdge(new extent(legonHall, athleticOval, 1900));
        graph.addEdge(new extent(legonHall, voltaHall, 190));
        graph.addEdge(new extent(legonHall, akuafoHall, 1700));
        graph.addEdge(new extent(legonHall, CSDepartment, 1200));
        graph.addEdge(new extent(legonHall, nightMarket, 1500));
        graph.addEdge(new extent(legonHall, diasporaHalls, 2500));
        graph.addEdge(new extent(legonHall, UGFireService, 1900));
        graph.addEdge(new extent(legonHall, greatHall, 1400));
        graph.addEdge(new extent(legonHall, ugcs, 220));
        graph.addEdge(new extent(legonHall, pentHall, 1700));
        graph.addEdge(new extent(legonHall, nnb, 850));
        graph.addEdge(new extent(legonHall, jqb, 1400));

        graph.addEdge(new extent(nightMarket, balmeLibrary, 1300));
        graph.addEdge(new extent(nightMarket, mainGate, 1200));
        graph.addEdge(new extent(nightMarket, nb, 1600));
        graph.addEdge(new extent(nightMarket, athleticOval, 950));
        graph.addEdge(new extent(nightMarket, voltaHall, 1300));
        graph.addEdge(new extent(nightMarket, akuafoHall, 1300));
        graph.addEdge(new extent(nightMarket, legonHall, 1100));
        graph.addEdge(new extent(nightMarket, CSDepartment, 1500));
        graph.addEdge(new extent(nightMarket, diasporaHalls, 1200));
        graph.addEdge(new extent(nightMarket, UGFireService, 900));
        graph.addEdge(new extent(nightMarket, greatHall, 2100));
        graph.addEdge(new extent(nightMarket, ugcs, 1400));
        graph.addEdge(new extent(nightMarket, pentHall, 2000));
        graph.addEdge(new extent(nightMarket, nnb, 1800));
        graph.addEdge(new extent(nightMarket, jqb, 1500));

        graph.addEdge(new extent(pentHall, balmeLibrary, 1200));
        graph.addEdge(new extent(pentHall, mainGate, 950));
        graph.addEdge(new extent(pentHall, nb, 1100));
        graph.addEdge(new extent(pentHall, athleticOval, 1750));
        graph.addEdge(new extent(pentHall, voltaHall, 1400));
        graph.addEdge(new extent(pentHall, akuafoHall, 1200));
        graph.addEdge(new extent(pentHall, legonHall, 1700));
        graph.addEdge(new extent(pentHall, nightMarket, 2000));
        graph.addEdge(new extent(pentHall, diasporaHalls, 2700));
        graph.addEdge(new extent(pentHall, UGFireService, 1100));
        graph.addEdge(new extent(pentHall, greatHall, 2500));
        graph.addEdge(new extent(pentHall, ugcs, 1200));
        graph.addEdge(new extent(pentHall, CSDepartment, 550));
        graph.addEdge(new extent(pentHall, nnb, 1300));
        graph.addEdge(new extent(pentHall, jqb, 650));

        // graph.listPlaces(null);

        // User interface
        // The places available
        String places[] = { "Main Gate", "Akuafo Hall", "Pentagon Hall", "UG Fire Service",
                "Athletic Oval",
                "Night Market",
                "Great Hall",
                "Legon Hall",
                "Diaspora", "Volta Hall", "CS Department", "NNB", "N Block", "JQB",
                "Balme Library", "UGCS" };
        UserInteface interact = new UserInteface();

        // Display Initial Position Label
        JLabel sourceLabel = new JLabel();
        sourceLabel.setText(new String("Starting Point"));
        sourceLabel.setBounds(50, 20, 200, 20);
        sourceLabel.setForeground(new Color(255, 0, 0));
        interact.add(sourceLabel);

        // displaying places in the comboBox
        JComboBox sourceCombo = new JComboBox(places);
        sourceCombo.setBounds(50, 50, 200, 35);
        interact.add(sourceCombo);// adding button in JFrame

        // Display destination label
        JLabel finalPosition = new JLabel();
        finalPosition.setText(new String("Final Destination"));
        finalPosition.setBounds(50, 100, 200, 35);
        finalPosition.setForeground(new Color(255, 0, 0));
        interact.add(finalPosition);

        // Display destination Combo
        JComboBox destinationCombo = new JComboBox(places);
        destinationCombo.setBounds(50, 130, 200, 35);
        interact.add(destinationCombo);// adding button in JFrame

        // inserting a label displaying the shortest path text
        JLabel info = new JLabel();
        info.setText("Shortest Route: ");
        info.setBounds(50, 230, 150, 40);// x-axis, y-axis, width, height
        info.setFont(new Font("Ebrima", Font.BOLD, 18));
        interact.add(info);

        JLabel shortestPathDisplay = new JLabel();
        shortestPathDisplay.setBounds(190, 230, 400, 40);
        shortestPathDisplay.setFont(new Font("Ebrima", Font.BOLD, 15));
        interact.add(shortestPathDisplay);

        JLabel distanceDisplay = new JLabel();
        distanceDisplay.setBounds(50, 270, 400, 40);// x-axis, y-axis, width, height
        interact.add(distanceDisplay);

        JButton button = new JButton("Get Route");
        button.setBounds(50, 180, 200, 35);
        interact.add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String theOrigin = sourceCombo.getSelectedItem().toString();
                String theEnd = destinationCombo.getSelectedItem().toString();

                Locations source = graph.getNodeByName(theOrigin);
                Locations destination = graph.getNodeByName(theEnd);

                Dijkstra.findShortestPath(graph, source, destination);
                String path = Dijkstra.getShortestPath(source, destination);
                shortestPathDisplay.setText(path);

                distanceDisplay.setText("Distance to cover:  " + Dijkstra.getTotalDistance(destination));
                distanceDisplay.setFont(new Font("Ebrima", Font.BOLD, 22));
            }
        });

    }
}