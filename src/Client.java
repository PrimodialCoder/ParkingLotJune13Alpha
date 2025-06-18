import controllers.TicketController;
import dtos.IssueRequestDto;
import dtos.IssueResponseDto;
import dtos.ResponseStatus;
import models.VehicleType;
import repositories.GateRespository;
import repositories.ParkingLotRepository;
import repositories.TicketRepository;
import repositories.VehicleRepository;
import services.ITicketService;
import services.InitialisationService;
import services.TicketService;

public class Client
{
    public static void main(String[] args) {
        GateRespository gateRespository = new GateRespository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        TicketRepository ticketRepository = new TicketRepository();

        InitialisationService initialisationService = new InitialisationService(parkingLotRepository);
        initialisationService.initialise();

        ITicketService ticketService = new TicketService(
                gateRespository, vehicleRepository,
                parkingLotRepository, ticketRepository
        );

        TicketController ticketController = new TicketController(ticketService);
        IssueRequestDto issueRequestDto = new IssueRequestDto();
        issueRequestDto.setEntry_gate_id(1);
        issueRequestDto.setVehicle_type(VehicleType.EV);
        issueRequestDto.setOperator_id(1);
        issueRequestDto.setLicense_plate("TG 07 2389");
        issueRequestDto.setParkinglot_id(1);

        IssueResponseDto response = ticketController.issueTicket(issueRequestDto);
        if(response.getStatus() == ResponseStatus.FAILURE)
        {
            System.out.println("Ticket Generation Failed");
            System.out.println(response.getFailureMessage());
        }else
        {
            System.out.println("Ticket Generation Successful. Slot: " + response.getParking_slot_number());
        }
    }
}
