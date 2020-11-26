using Microsoft.EntityFrameworkCore.Migrations;

namespace TicTacToeAPIv1.Migrations
{
    public partial class InitialMigration : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.CreateTable(
                name: "Positions",
                columns: table => new
                {
                    Id = table.Column<int>(nullable: false)
                        .Annotation("Sqlite:Autoincrement", true),
                    Cell01 = table.Column<string>(nullable: true),
                    Cell02 = table.Column<string>(nullable: true),
                    Cell03 = table.Column<string>(nullable: true),
                    Cell04 = table.Column<string>(nullable: true),
                    Cell05 = table.Column<string>(nullable: true),
                    Cell06 = table.Column<string>(nullable: true),
                    Cell07 = table.Column<string>(nullable: true),
                    Cell08 = table.Column<string>(nullable: true),
                    Cell09 = table.Column<string>(nullable: true),
                    M = table.Column<int>(nullable: false),
                    N = table.Column<int>(nullable: false),
                    K = table.Column<int>(nullable: false),
                    State = table.Column<string>(nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Positions", x => x.Id);
                });
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropTable(
                name: "Positions");
        }
    }
}
