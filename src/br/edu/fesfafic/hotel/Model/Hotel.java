package br.edu.fesfafic.hotel.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Hotel {
    private String nome;
    private List<Suite> suites;
    private List<Recepcionista> recepcionistas;
    private List<Camareira> camareiras;
    private List<Checkin> checkinsAtv;
    private List<Checkin> regCheckins;
    private List<Checkout> regCheckout;
    private Restaurante restaurante;

    public Hotel(String nome, Restaurante restaurante){
        this.nome = nome;
        this.restaurante = restaurante;
        this.suites = new ArrayList<>();
        this.camareiras = new ArrayList<>();
        this.recepcionistas = new ArrayList<>();
        this.checkinsAtv = new ArrayList<>();
        this.regCheckins = new ArrayList<>();
        this.regCheckout = new ArrayList<>();
    }

    public void exibirCheckinsAtv(){
        System.out.println("Checkins Ativos: ");
        if(this.checkinsAtv.isEmpty())
            System.out.println("Nenhum hóspede no hotel.");
        else {
            ListIterator<Checkin> enumerate = this.checkinsAtv.listIterator();
            while(enumerate.hasNext()) {
                System.out.println(enumerate.nextIndex() + " - " + enumerate.next());
            }
        }
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void addSuite(Suite suite){
        this.suites.add(suite);
    }

    public void removerSuite(Suite suite){
        this.suites.remove(suite);
    }
    public void addRecepcionista(Recepcionista recepcionista){
        this.recepcionistas.add(recepcionista);
    }
    public void removerRecepcionista(Recepcionista recepcionista){
        this.recepcionistas.remove(recepcionista);
    }
    public void addCamareira(Camareira camareira){
        this.camareiras.add(camareira);
    }
    public void removerCamareira(Camareira camareira){
        this.camareiras.remove(camareira);
    }

    public void addCheckinAtv(Checkin checkin){
        if(checkin.isCheckinCompleto())
            this.checkinsAtv.add(checkin);
        else
            System.out.println("O checkin ainda não foi finalizado.");
    }
    public void removeCheckinAtv(Checkin checkin){
        this.checkinsAtv.remove(checkin);
    }

    public void addRegCheckin(Checkin checkin){
        this.regCheckins.add(checkin);
    }
    public void addRegCheckout(Checkout checkout){
        this.regCheckout.add(checkout);
    }
    public List<Suite> getSuites() {
        return suites;
    }

    public List<Recepcionista> getRecepcionistas() {
        return recepcionistas;
    }

    public List<Camareira> getCamareiras() {
        return camareiras;
    }

    public List<Checkin> getCheckinsAtv() {
        return checkinsAtv;
    }

    public List<Checkin> getRegCheckins() {
        return regCheckins;
    }

    public List<Checkout> getRegCheckout() {
        return regCheckout;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "nome='" + nome + '\'' +
                ", suites=" + suites +
                ", recepcionistas=" + recepcionistas +
                ", camareiras=" + camareiras +
                ", restaurante=" + restaurante +
                '}';
    }
}
