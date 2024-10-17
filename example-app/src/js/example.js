import { FilePermission } from 'file-permission-plugin';

window.testEcho = () => {
    const inputValue = document.getElementById("echoInput").value;
    FilePermission.echo({ value: inputValue })
}
