
package Sintactico;


public class TAS_IrA {
    
    private final String Ir_A[][] = new String[282][48];
    
    TAS_IrA(){
        
        Ir_A[0][0] = "PRINCIPAL";
        Ir_A[1][0] = "1";
        
        Ir_A[0][1] = "CONSTRUCTOR";
        
        Ir_A[0][2] = "LLAMAMET";
        Ir_A[50][2] = "72";
        Ir_A[55][2] = "82";
        Ir_A[58][2] = "93";
        Ir_A[66][2] = Ir_A[67][2] = Ir_A[99][2] = "106"; 
        Ir_A[116][2] = "82";
        Ir_A[121][2] = "179";
        Ir_A[135][2] = Ir_A[154][2] = Ir_A[156][2] = "188";
        Ir_A[171][2] = Ir_A[172][2] = "211";
        Ir_A[224][2] = Ir_A[225][2] = Ir_A[226][2] = Ir_A[228][2] = "188";
        
        Ir_A[0][3] = "DECMET";
        Ir_A[0][4] = "METODO";
        Ir_A[0][5] = "RETORNA";
        Ir_A[0][6] = "BUCLE";
        Ir_A[0][7] = "CONDICION";
        Ir_A[0][8] = "DECMAIN";
        Ir_A[0][9] = "VAR";
        
        Ir_A[0][10] = "MASVAR";
        Ir_A[20][10] = "52";
        Ir_A[68][10] = "108";
        Ir_A[88][10] = "132";
        Ir_A[102][10] = "158";
        
        Ir_A[0][11] = "MAS";
        Ir_A[20][11] = "51";
        Ir_A[68][11] = "109";
        Ir_A[88][11] = "131";
        Ir_A[89][11] = "133";
        Ir_A[93][11] = "151";
        Ir_A[94][11] = "152";
        Ir_A[95][11] = "154";
        Ir_A[149][11] = "189";
        Ir_A[151][11] = "191";
        Ir_A[191][11] = "226";
        
        Ir_A[0][12] = "VECTOR";
        Ir_A[20][12] = Ir_A[68][12] = Ir_A[88][12] = Ir_A[102][12] = "58";
        
        Ir_A[0][13] = "DECV";
        Ir_A[118][13] = Ir_A[200][13] = "172";
        
        Ir_A[0][14] = "MASV";
        Ir_A[242][14] = "257";
        Ir_A[262][14] = "271";
        Ir_A[268][14] = "273";
        Ir_A[271][14] = "276";
        Ir_A[276][14] = "279";
        Ir_A[279][14] = "281"; 
        
        Ir_A[0][15] = "OPERACION";
        Ir_A[58][15] = "94";
        Ir_A[66][15] = "104";
        Ir_A[67][15] = "107";
        Ir_A[99][15] = "156";
        
        
        Ir_A[0][16] = "MASOP";
        Ir_A[135][16] = "185";
        Ir_A[154][16] = "192";
        Ir_A[156][16] = "193";
        Ir_A[224][16] = "246";
        Ir_A[225][16] = "247";
        Ir_A[226][16] = "248";
        Ir_A[228][16] = "249";
        
        
        Ir_A[0][17] = "SALIDA";
        
        Ir_A[0][18] = "CONCATENA";
        Ir_A[167][18] = "202";
        Ir_A[235][18] = "253";
        Ir_A[255][18] = "264";
        
        
        Ir_A[0][19] = "ENTRADA";
        Ir_A[0][20] = "DECLARAV";
        
        Ir_A[0][21] = "MASD";
        Ir_A[171][21] = "206";
        Ir_A[172][21] = "212";
        
        
        Ir_A[0][22] = "INSTRUCCION";
        //Ir_A[5][22] = "5";
        Ir_A[7][22] = "35";
        Ir_A[8][22] = "36";
        Ir_A[9][22] = "38";
        Ir_A[10][22] = "39";
        int v = 40;
        for(int i = 11; i < 19; i++){
            Ir_A[i][22] = Integer.toString(v);
            v++;
        }
        Ir_A[72][22] = "114";
        Ir_A[160][22] = "196";
        Ir_A[168][22] = "205";
        Ir_A[196][22] = "228";
        Ir_A[198][22] = "229";
        Ir_A[199][22] = "230";
        Ir_A[264][22] = "272";
        
        Ir_A[0][23] = "ARGS";
        Ir_A[20][23] = "48";
        Ir_A[65][23] = "102";
        Ir_A[102][23] = "157";
        
        Ir_A[0][24] = "MASAR";
        Ir_A[55][24] = Ir_A[104][24] = "77";
        Ir_A[119][24] = "173";
        Ir_A[185][24] = "222";
        
        Ir_A[0][25] = "PARAM";
        Ir_A[20][25] = Ir_A[74][25] = Ir_A[85][25] = Ir_A[98][25] = Ir_A[169][25] = 
        Ir_A[181][25] = Ir_A[188][25] = Ir_A[211][25] = "50";
        
        Ir_A[0][26] = "VACIO";
        Ir_A[55][26] = Ir_A[116][26] =  "83";
        
        Ir_A[0][27] = "MASP";
        Ir_A[79][27] = "119";
        Ir_A[80][27] = "122";
        Ir_A[83][27] = "127";
        Ir_A[85][27] = "128";
        Ir_A[125][27] = "182";
        Ir_A[169][27] = "128";
        Ir_A[175][27] = "214";
        Ir_A[176][27] = "215";
        Ir_A[179][27] = "218";
        Ir_A[180][27] = "219";
        Ir_A[181][27] = "220";
        Ir_A[182][27] = "221";
        Ir_A[218][27] = "245";
        Ir_A[245][27] = "262";
        
        Ir_A[0][28] = "MAST";
        Ir_A[82][28] = "124";
        Ir_A[92][28] = "150";
        Ir_A[113][28] = "166";
        Ir_A[126][28] = "183";
        Ir_A[178][28] = "217";
        Ir_A[236][28] = "254";
        Ir_A[244][28] = "261";
        Ir_A[270][28] = "275";
        
        Ir_A[0][29] = "TIPOP";
        
        Ir_A[0][30] = "TIPO";
        Ir_A[22][30] = "63";
        Ir_A[55][30] = "76";
        Ir_A[86][30] = "129";
        Ir_A[104][30] = "76";
        
        
        Ir_A[0][31] = "SIMBOLO";
        Ir_A[89][31] = "134";
        Ir_A[94][31] = "153";
        Ir_A[98][31] = "155";
        Ir_A[106][31] = "134";
        Ir_A[107][31] = "153";
        Ir_A[187][31] = "223";
        Ir_A[188][31] = "224";
        Ir_A[189][31] = "225";
        Ir_A[195][31] = "227";
        
        Ir_A[0][32] = "BO";
        Ir_A[58][32] = "92";
        Ir_A[121][32] = "178";
        
        Ir_A[0][33] = "NUM";
        Ir_A[21][33] = "60";
        Ir_A[58][33] = "88";
        Ir_A[66][33] = Ir_A[67][33] = "105";
        Ir_A[90][33] = "148";
        Ir_A[99][33] = "105";
        Ir_A[135][33] = Ir_A[154][33] = Ir_A[156][33] = "186";
        Ir_A[171][33] = Ir_A[172][33] = "207";
        Ir_A[209][33] = "237";
        Ir_A[214][33] = "241";
        Ir_A[224][33] = Ir_A[225][33] = Ir_A[226][33] = Ir_A[228][33] = "186";
        Ir_A[259][33] = "267";
        
        
        Llenar(5);
        for (int i = 7; i < 19; i++){
            Llenar(i);
        }
        Llenar(72);
        Llenar(160);
        Llenar(168);
        Llenar(196);
        Llenar(198);
        Llenar(199);
        Llenar(264);
        Llenar2(5);
        for (int i = 7; i < 19; i++){
            Llenar2(i);
        }
        Llenar2(72);
        Llenar2(160);
        Llenar2(168);
        Llenar2(196);
        Llenar2(198);
        Llenar2(199);
        Llenar2(264);
        Ir_A[5][22] = "5";
    }
    
    private void Llenar(int fil){
        Ir_A[fil][1] = "6";
        Ir_A[fil][2] = "7";
        Ir_A[fil][3] = "8";
        Ir_A[fil][4] = "10";
        Ir_A[fil][5] = "9";
        Ir_A[fil][6] = "11";
        Ir_A[fil][7] = "12";
        Ir_A[fil][8] = "17";
        Ir_A[fil][9] = "13";
    }
    
    private void Llenar2(int fil){
        Ir_A[fil][17] = "16";
        Ir_A[fil][19] = "15";
        Ir_A[fil][20] = "14";
        Ir_A[fil][29] = "21";
        Ir_A[fil][30] = "24";
    }
    
    public String Ir_A(String estado, String terminal){
        int e = Integer.parseInt(estado) + 1;
        int t = 0;
        
        for(int i = 0; i < 34; i++){
            if(Ir_A[0][i].equals(terminal)){
                t = i;
            }
        }
        
        return Ir_A[e][t];
    }
}
